close all hidden % fechar todas as janelas
clear % limpar a memória
clc % limpa a tela da área de tra

A = [1 1 1 1 1; 1 1 3 1 1; 1 3 2 3 1; 1 1 3 1 1; 1 1 1 1 1];

mapa=[0 1 0; 0 0 1; 1 1 0];

I = mat2gray(A);
figure, imshow(A, mapa);