close all hidden % fechar todas as janelas
clear % limpar a mem�ria
clc % limpa a tela da �rea de trabalho
A = imread('cacau_escuro.tif'); % Ler o arquivo
%A=rgb2gray(A);
figure, imshow(A); % mostrar a imagem
figure, imhist(A);
B=histeq(A);
figure, imshow(B);
figure, imhist(B);