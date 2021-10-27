clear, close all,  clc
g1 = imread('cromossomos.bmp'); 
g2 = imread('fundo_cromossomos.bmp');
%g1=rgb2gray(g1);
%g2=rgb2gray(g2);
figure, imshow(g1);
figure, imshow(g2);
g3 = imabsdiff(g2,g1); 
g4 = imcomplement(g3);
figure('Name', 'Imagem Original'),imshow(g1)
figure('Name', 'Histograma da Img. Original'), imhist(g1)
figure('Name','Imagem do Fundo'), imshow(g2)
figure('Name','Histograma da Imagem do Fundo'), imhist(g2)
figure('Name', 'Imagem Diferença'), imshow(g3)
figure('Name', 'Histograma da Imagem Diferença'), imhist(g3)
figure('Name','Imagem resultado da subtração complementada'), imshow(g4)
figure('Name','Histograma da Imagem complementada'), imhist(g4)

