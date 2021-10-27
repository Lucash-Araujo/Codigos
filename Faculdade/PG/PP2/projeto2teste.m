## Grupo 6
# Jesimiel Efraim Dias RA: 726544
# Lucas Henrique de Araujo RA: 759521
# Rafael Toledo RA: 743590
# Victor Mendes RA: 756206
# Victória Resende RA: 759539

pkg load image

clear all
close all
clc
#--------------Zero--------------
figure;
img=im2bw(imread('Imagens/0.png'));
img = bwmorph(img,'skel',Inf);
#Passando os parametros usados para calcular a compacidade e o euler: Perimeter, Area, EulerNumber
img = bwmorph(img,'skel',Inf);
#Passando os parametros usados para calcular a compacidade e o euler: Perimeter, Area, EulerNumber
s = regionprops(img,'Perimeter','Area', 'EulerNumber','MajorAxisLength','MinorAxisLength')
comp = s.Perimeter * s.Perimeter / s.Area;
exc = s.MajorAxisLength / s.MinorAxisLength;
%Calculando a compacidade
%Usar cstrcat ao inves de strcat e melhor pois ele nao apaga o espaco do final
titulo = cstrcat("9 - Número de Euler na párte superior e aaa: ", mat2str(s.EulerNumber, 6), " ", mat2str(s.Area, 6), " ", mat2str(exc, 6), " ", mat2str(comp, 6));
subplot(1, 1, 1), imshow(img);
    title (titulo);
    
#--------------Um--------------
figure;
img=im2bw(imread('Imagens/1.png'));
img = bwmorph(img,'skel',Inf);
#Passando os parametros usados para calcular a compacidade e o euler: Perimeter, Area, EulerNumber
s = regionprops(img,'Perimeter','Area', 'EulerNumber','MajorAxisLength','MinorAxisLength')
comp = s.Perimeter * s.Perimeter / s.Area;
exc = s.MajorAxisLength / s.MinorAxisLength;
%Calculando a compacidade
%Usar cstrcat ao inves de strcat e melhor pois ele nao apaga o espaco do final
titulo = cstrcat("9 - Número de Euler na párte superior e aaa: ", mat2str(s.EulerNumber, 6), " ", mat2str(s.Area, 6), " ", mat2str(exc, 6), " ", mat2str(comp, 6));
subplot(1, 1, 1), imshow(img);
    title (titulo);
#--------------Dois--------------
figure;
img=im2bw(imread('Imagens/2.png'));
bwesq = bwmorph(img,'skel',Inf);
#Passando os parametros usados para calcular a compacidade e o euler: Perimeter, Area, EulerNumber
s = regionprops(bwesq,'Perimeter','Area')
comp = s.Perimeter * s.Perimeter / s.Area;
%Calculando a compacidade
%Usar cstrcat ao inves de strcat e melhor pois ele nao apaga o espaco do final
titulo = cstrcat("Esqueletonização e compacidade: ", mat2str(comp, 6));
subplot(1, 2, 1), imshow(img);
    title ("Dois");
subplot(1, 2, 2), imshow(bwesq);
    title (titulo);

#--------------Tres--------------    
figure;
img=im2bw(imread('Imagens/3.png'));
img = bwmorph(img,'skel',Inf);
#Passando os parametros usados para calcular a compacidade e o euler: Perimeter, Area, EulerNumber
s = regionprops(img,'Perimeter','Area', 'EulerNumber','MajorAxisLength','MinorAxisLength')
comp = s.Perimeter * s.Perimeter / s.Area;
exc = s.MajorAxisLength / s.MinorAxisLength;
%Calculando a compacidade
%Usar cstrcat ao inves de strcat e melhor pois ele nao apaga o espaco do final
titulo = cstrcat("9 - Número de Euler na párte superior e aaa: ", mat2str(s.EulerNumber, 6), " ", mat2str(s.Area, 6), " ", mat2str(exc, 6), " ", mat2str(comp, 6));
subplot(1, 1, 1), imshow(img);
    title (titulo);

#--------------Quatro--------------    
figure;
img=im2bw(imread('Imagens/4.png'));
img = bwmorph(img,'skel',Inf);
#Passando os parametros usados para calcular a compacidade e o euler: Perimeter, Area, EulerNumber
s = regionprops(img,'Perimeter','Area', 'EulerNumber','MajorAxisLength','MinorAxisLength')
comp = s.Perimeter * s.Perimeter / s.Area;
exc = s.MajorAxisLength / s.MinorAxisLength;
%Calculando a compacidade
%Usar cstrcat ao inves de strcat e melhor pois ele nao apaga o espaco do final
titulo = cstrcat("9 - Número de Euler na párte superior e aaa: ", mat2str(s.EulerNumber, 6), " ", mat2str(s.Area, 6), " ", mat2str(exc, 6), " ", mat2str(comp, 6));
subplot(1, 1, 1), imshow(img);
    title (titulo);
    
#--------------Cinco--------------    
figure;
img=im2bw(imread('Imagens/5.png'));
img = bwmorph(img,'skel',Inf);
#Passando os parametros usados para calcular a compacidade e o euler: Perimeter, Area, EulerNumber
s = regionprops(img,'Perimeter','Area', 'EulerNumber','MajorAxisLength','MinorAxisLength')
comp = s.Perimeter * s.Perimeter / s.Area;
exc = s.MajorAxisLength / s.MinorAxisLength;
%Calculando a compacidade
%Usar cstrcat ao inves de strcat e melhor pois ele nao apaga o espaco do final
titulo = cstrcat("9 - Número de Euler na párte superior e aaa: ", mat2str(s.EulerNumber, 6), " ", mat2str(s.Area, 6), " ", mat2str(exc, 6), " ", mat2str(comp, 6));
subplot(1, 1, 1), imshow(img);
    title (titulo);

#--------------Seis--------------
figure;
img=im2bw(imread('Imagens/6.png'));
img = bwmorph(img,'skel',Inf);
#Passando os parametros usados para calcular a compacidade e o euler: Perimeter, Area, EulerNumber
s = regionprops(img,'Perimeter','Area', 'EulerNumber','MajorAxisLength','MinorAxisLength')
comp = s.Perimeter * s.Perimeter / s.Area;
exc = s.MajorAxisLength / s.MinorAxisLength;
%Calculando a compacidade
%Usar cstrcat ao inves de strcat e melhor pois ele nao apaga o espaco do final
titulo = cstrcat("9 - Número de Euler na párte superior e aaa: ", mat2str(s.EulerNumber, 6), " ", mat2str(s.Area, 6), " ", mat2str(exc, 6), " ", mat2str(comp, 6));
subplot(1, 1, 1), imshow(img);
    title (titulo);

#--------------Sete--------------
figure;
img=im2bw(imread('Imagens/7.png'));
img = bwmorph(img,'skel',Inf);
#Passando os parametros usados para calcular a compacidade e o euler: Perimeter, Area, EulerNumber
s = regionprops(img,'Perimeter','Area', 'EulerNumber','MajorAxisLength','MinorAxisLength')
comp = s.Perimeter * s.Perimeter / s.Area;
exc = s.MajorAxisLength / s.MinorAxisLength;
%Calculando a compacidade
%Usar cstrcat ao inves de strcat e melhor pois ele nao apaga o espaco do final
titulo = cstrcat("9 - Número de Euler na párte superior e aaa: ", mat2str(s.EulerNumber, 6), " ", mat2str(s.Area, 6), " ", mat2str(exc, 6), " ", mat2str(comp, 6));
subplot(1, 1, 1), imshow(img);
    title (titulo);
#--------------Oito--------------    
figure;
img=im2bw(imread('Imagens/8.png'));
img = bwmorph(img,'skel',Inf);
#Passando os parametros usados para calcular a compacidade e o euler: Perimeter, Area, EulerNumber
s = regionprops(img,'Perimeter','Area', 'EulerNumber','MajorAxisLength','MinorAxisLength');
%comp = s.Perimeter * s.Perimeter / s.Area;
%exc = s.MajorAxisLength / s.MinorAxisLength;
%Calculando a compacidade
%Usar cstrcat ao inves de strcat e melhor pois ele nao apaga o espaco do final
titulo = cstrcat("9 - Número de Euler na párte superior e aaa: ", mat2str(s.EulerNumber, 6), " ", mat2str(s.Area, 6), " ", mat2str(exc, 6), " ", mat2str(comp, 6));
subplot(1, 1, 1), imshow(img);
    title (titulo);

#--------------Nove--------------    
figure;
img=im2bw(imread('Imagens/9.png'));
img = bwmorph(img,'skel',Inf);
#Passando os parametros usados para calcular a compacidade e o euler: Perimeter, Area, EulerNumber
s = regionprops(img,'Perimeter','Area', 'EulerNumber','MajorAxisLength','MinorAxisLength')
comp = s.Perimeter * s.Perimeter / s.Area;
exc = s.MajorAxisLength / s.MinorAxisLength;
%Calculando a compacidade
%Usar cstrcat ao inves de strcat e melhor pois ele nao apaga o espaco do final
titulo = cstrcat("9 - Número de Euler na párte superior e aaa: ", mat2str(s.EulerNumber, 6), " ", mat2str(s.Area, 6), " ", mat2str(exc, 6), " ", mat2str(comp, 6));
subplot(1, 1, 1), imshow(img);
    title (titulo);