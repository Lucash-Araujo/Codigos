clc, clear all, close all;
pkg load image

Inf = 100;

img = imread('5.png');
img = im2bw(img);

cima = imcrop(img, [1, 1, columns(img)-1, rows(img)/2-1]);
baixo = imcrop(img, [1, rows(img)/2, columns(img)-1, rows(img)/2 - 1]);

figure, imshow(cima), title("cima");
figure, imshow(baixo), title("baixo");
cima_baixo = or(cima, baixo);

figure, imshow(cima_baixo), title("Cima + Baixo");
cima_baixo = regionprops(cima_baixo, 'Area');