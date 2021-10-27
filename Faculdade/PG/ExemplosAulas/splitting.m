close all % fechar todas as janelas
clear % limpar a mem�ria
clc % limpa a tela da �rea de trabalho
A=imread('cacau_escuro.tif'); % Ler o arquivo
limiar=45;
split=15;
figure, imshow(A); % mostrar a imagem
figure, imhist(A);
[lin col]=size(A); % obt�m dimens�es da imagem
for i=1:lin
    for j=1:col
        if A(i,j) <= limiar
            B(i,j)=A(i,j)-split;
        else
            B(i,j)=A(i,j)+split;
        end
        if B(i,j)>255
            B(i,j)=255;
        else
            if B(i,j)<0
                B(i,j)=0;
            end
        end
    end
end
figure, imhist(B);
figure, imshow(B);
