% Grupo 6
% Jesimiel Efraim Dias RA: 726544
% Lucas Henrique de Araujo RA: 759521
% Rafael Toledo RA: 743590
% Victor Mendes RA: 756206
% Victória Resende RA: 759539

pkg load image

clear all
close all
clc

%-------------------------Codigo da Cadeia----------------------------
function a = cadeia(img)
    a = 0;
    subplot(2, 2, 3), imshow(~img);
      title ("Codigo da Cadeia sob o esqueleto");
    hold on
    b = bwboundaries(img);
    [boundarycount, asdf] = size(b);

    grid = 10;
    for k=1:boundarycount
        j=0;
        array = [];
        [rows, columns] = size(b{k,1});
        for i=1:rows-1
            y = round(b{k,1}(i,1)/grid);
            x = round(b{k,1}(i,2)/grid);
            y2 = round(b{k,1}(i+1,1)/grid);
            x2 = round(b{k,1}(i+1,2)/grid);

            dx = x2 - x;
            dy = y2 - y;
            if not(dx == 0 && dy==0)
                plot(x*grid, y*grid, 'Marker', '.', 'Color', [0 0 1], 'MarkerSize', 5);
                plot([x*grid,x2*grid],[y*grid,y2*grid],'Color','r','LineWidth',2);
                j = j+1;
                if (dx == 1 && dy ==0)
                   array(j) = 0;
                end
                if (dx == 1 && dy ==1)
                   array(j) = 1;
                end
                if (dx == 0 && dy ==1)
                   array(j) = 2;
                end
                if (dx == -1 && dy ==1)
                   array(j) = 3;
                end
                if (dx == -1 && dy ==0)
                   array(j) = 4;
                end
                if (dx == -1 && dy ==-1)
                   array(j) = 5;
                end
                if (dx == 0 && dy ==-1)
                   array(j) = 6; 
                end
                if (dx == 1 && dy ==-1)
                   array(j) = 7; 
                end
                text((x+0.5)*grid, (y+0.5)*grid,num2str(array(j)),'FontSize',9,'Color',[0 .5 0]);
            end
        end;
        %como o for pode repetir mais de uma vez, coloquei esse if pra pegar o maior codigo da cadeia presente na imagem
        %como a imagem tem um componente soh nem seria preciso
        if(a < j)
            a = j;
        end
    end;
    hold off
end


%--------------------------------Main---------------------------------
%--------------Zero--------------
%O zero tem a menor Compacidade sem o Euler tambem mas dai nao seria possivel usar a compacidade no tres
figure;
img=im2bw(imread('Imagens/0.png'));
%Passando os parametros usados para calcular a compacidade e o euler: Perimeter, Area, EulerNumber
s = regionprops(img,'Perimeter','Area', 'EulerNumber')
%Calculando a compacidade
comp = s.Perimeter * s.Perimeter / s.Area;
%Usar cstrcat ao inves de strcat eh melhor pois ele nao apaga o espaco do final
titulo = cstrcat("0 - Número de Euler e menor Compacidade: ", mat2str(s.EulerNumber, 6), " e ", mat2str(comp, 6));
subplot(1, 1, 1), imshow(img);
    title (titulo);
%--------------Um--------------
%Como o um tem uma reta grande ele tem um MajorAxisLength enorme e o MinorAxisLength nao pega o tamanho da base entao a excentricidade dele eh a maior
figure;
img=im2bw(imread('Imagens/1.png'));
%Passando os parametros usados para calcular a excentricidade: MajorAxisLength, MinorAxisLength
s = regionprops(img, 'MajorAxisLength','MinorAxisLength')
%Calculando a excentricidade
exc = s.MajorAxisLength / s.MinorAxisLength;
%Usar cstrcat ao inves de strcat eh melhor pois ele nao apaga o espaco do final
titulo = cstrcat("1 - Maior Excentricidade: ", mat2str(exc, 6));
subplot(1, 1, 1), imshow(img);
    title (titulo);
%--------------Dois--------------
%A Esqueletonizacao do dois eh horrivel por isso ele tem a maior Compacidade
figure;
img=im2bw(imread('Imagens/2.png'));
bwesq = bwmorph(img,'skel',Inf);
#Passando os parametros usados para calcular a compacidade: Perimeter, Area
s = regionprops(bwesq,'Perimeter','Area')
%Calculando a compacidade
comp = s.Perimeter * s.Perimeter / s.Area;
%Usar cstrcat ao inves de strcat eh melhor pois ele nao apaga o espaco do final
titulo = cstrcat("Esqueletonização e maior Compacidade: ", mat2str(comp, 6));
subplot(1, 2, 1), imshow(img);
    title ("Dois");
subplot(1, 2, 2), imshow(bwesq);
    title (titulo);
%--------------Tres--------------
%O tres tem a maior compacidade de todos os numeros sem precisar fazer nada nele
figure;
img=im2bw(imread('Imagens/3.png'));
%Passando os parametros usados para calcular a compacidade: Perimeter, Area
s = regionprops(img,'Perimeter', 'Area')
%Calculando a compacidade
comp = s.Perimeter * s.Perimeter / s.Area;
titulo = cstrcat("3 - Maior Compacidade: ", mat2str(comp, 6));
subplot(1, 1, 1), imshow(img);
    title (titulo);
%--------------Quatro--------------
%O quatro tem duas retas grandes o que torna ele o de menor Excentricidade
figure;
img=im2bw(imread('Imagens/4.png'));
%Passando os parametros usados para calcular a excentricidade e o Euler: MajorAxisLength, MinorAxisLength, Euler
s = regionprops(img, 'MajorAxisLength','MinorAxisLength', 'EulerNumber')
%Calculando a excentricidade
exc = s.MajorAxisLength / s.MinorAxisLength;
titulo = cstrcat("4 - Número de Euler e menor Excentricidade: ", mat2str(s.EulerNumber, 6), " e ", mat2str(exc, 6));
subplot(1, 1, 1), imshow(img);
    title (titulo);
%--------------Cinco--------------    
%O cinco eh bem assimetrico entao ao separar a perte superior da inferior e executar um or() a Area dele fica a maior entre todos
figure;
img=im2bw(imread('Imagens/5.png'));

%Corta a imagem pegando todas as colunas mas so metade das linhas
cima = imcrop(img, [1, 1, columns(img)-1, rows(img)/2-1]);
%Mesma coisa soh que pega as linhas da parte de baixo
baixo = imcrop(img, [1, rows(img)/2, columns(img)-1, rows(img)/2 - 1]);
%'Soma' a parte de cima com a debaixo, resulta em uma imagem com metade das linhas
cima_baixo = or(cima, baixo);
%Passando os parametros usados para calcular a area: Area
s = regionprops(cima_baixo, 'Area');
titulo = cstrcat("5 - Area da parte superior + inferior: ", mat2str(s.Area, 6));
subplot(1, 2, 1), imshow(img);
    title ("Cinco");
subplot(1, 2, 2), imshow(cima_baixo);
    title (titulo)
%--------------Seis--------------
%Como sugerido na aula o seis eh o unico de Euler = 0 com a menor compacidade na parte inferior
figure;
img=im2bw(imread('Imagens/6.png'));
B = imcrop(img, [1, rows(img)/2, columns(img)-1, rows(img)/2 - 1]);

#Passando os parametros usados para calcular a compacidade e o euler: Perimeter, Area, EulerNumber
sB = regionprops(B,'Perimeter','Area', 'EulerNumber')
sI = regionprops(img,'Perimeter','Area', 'EulerNumber')
%Calculando a compacidade
comp = sB.Perimeter * sB.Perimeter / sB.Area;
%Usar cstrcat ao inves de strcat e melhor pois ele nao apaga o espaco do final
titulo = cstrcat("6 - Número de Euler e menor Compacidade na parte inferior: ", mat2str(sI.EulerNumber, 6), " e ", mat2str(comp, 6));
subplot(1, 2, 1), imshow(img);
    title (titulo);
subplot(1, 2, 2), imshow(B);
    title ("Parte inferior");
%--------------Sete--------------
%O sete perde pro um em menor tamanha da cadeia mas com a esqueletonizacao antes o sete fica menor que o um pois a esqueletonizacao do um tem muito ruido
figure;
img=im2bw(imread('Imagens/7.png'));
%Esqueletoniza a imagem
bwesq = bwmorph(img, 'skel',Inf);
#Passando os parametros usados para o euler: EulerNumber
s = regionprops(img, 'EulerNumber');
titulo = cstrcat("7 - Euler, esqueletonização e menor código da cadeia: ", mat2str(s.EulerNumber, 6));
subplot(2, 2, 1), imshow(img);
    title (titulo);
subplot(2, 2, 2), imshow(bwesq);
    title ("Imagem esqueletonizada");

%chamando a funcao cadeia pra deixar o codigo mais facil de ler
%a propria funcao ja faz o subplot pra poder colocar em tela o codigo da cadeia
%c eh o tamanho da cadeia, mas como ele vem por ultimo nao da pra inserir nos titulos
c = cadeia(bwesq);
%fprintf('Tamanho da cadeia: %d', c);
%--------------Oito--------------
%O oito eh o unico com euler negativo
figure;
img=im2bw(imread('Imagens/8.png'));
%Passando os parametros usados para o euler: EulerNumber
s = regionprops(img, 'EulerNumber')
titulo = cstrcat("8 - Menor número de Euler: ", mat2str(s.EulerNumber, 6));
subplot(1, 1, 1), imshow(img);
    title (titulo);

%--------------Nove--------------
%O nove eh o seis invertido, ams para nao usar os mesmos descritores, contamos apenas o Euler da parte superior, que fica soh o oito e o nove, entao contamos a area deles 
figure;
img=im2bw(imread('Imagens/9.png'));
B = imcrop(img, [1, 1, columns(img)-1, rows(img)/2]);
#Passando os parametros usados para a area na imagem e o euler na metade: Area, EulerNumber
sB = regionprops(B,'EulerNumber')
sI = regionprops(img,'Area')
%Usar cstrcat ao inves de strcat e melhor pois ele nao apaga o espaco do final
titulo = cstrcat("9 - Número de Euler na parte superior e menor Area: ", mat2str(sB.EulerNumber, 6), " e ", mat2str(sI.Area));
subplot(1, 2, 1), imshow(img);
    title (titulo);
subplot(1, 2, 2), imshow(B);
    title ("Parte superior");