close all % fechar todas as janelas
clear % limpar a mem�ria
clc % limpa a tela da �rea de trabalho
A=imread('cacau_escuro.tif'); % Ler o arquivo
maior_cinza=max(max(A));
qtd_niveis=4;
passo=round(maior_cinza/qtd_niveis);
figure, imshow(A); % mostrar a imagem
figure, imhist(A);
[lin col]=size(A); % obt�m dimens�es da imagem
for i=1:lin
    for j=1:col
        B(i,j)=round(A(i,j)/passo)*passo;
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
