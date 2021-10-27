clear all
close all
clc

pkg load image

img1 = imread('img1.jpg');
img2 = imread('img2.jpg');
img3 = imread('img3.jpg');


BW1 = im2bw(img1);
BW2 = im2bw(img2);
BW3 = im2bw(img3);

g1 = ones(size(BW1));
g2 = ones(size(BW2));
g3 = ones(size(BW3));

g1(2:2:end,:,:) = 0;
g1(:,2:2:end,:) = 0;

g2(2:2:end,:,:) = 0;
g2(:,2:2:end,:) = 0;

g3(2:2:end,:,:) = 0;
g3(:,2:2:end,:) = 0;

figure,subplot(1,3,1),imshow(BW1),title('Imagem BW 1');
subplot(1,3,2), imshow(BW2),title('Imagem BW 2');
subplot(1,3,3), imshow(BW3),title('Imagem BW 3');

figure, imshow(BW1), title('Imagem 1 com 4-conectados'); hold on;
gimage = imshow(g1);
set(gimage,'AlphaData', 0.8);
Aprox_poligonal4(BW1);
figure, imshow(BW1), title('Imagem 1 com 8-conectados'); hold on;
gimage = imshow(g1);
set(gimage,'AlphaData', 0.8);
Aprox_poligonal8(BW1);


figure, imshow(BW2), title('Imagem 2 com 4-conectados'); hold on;
gimage = imshow(g2);
set(gimage,'AlphaData', 0.8);
Aprox_poligonal4(BW2);
figure, imshow(BW2), title('Imagem 2 com 8-conectados'); hold on;
gimage = imshow(g2);
set(gimage,'AlphaData', 0.8);
Aprox_poligonal8(BW2);

figure, imshow(BW3), title('Imagem 3 com 4-conectados'); hold on;
gimage = imshow(g3);
set(gimage,'AlphaData', 0.8);
Aprox_poligonal4(BW3);
figure, imshow(BW3), title('Imagem 3 com 8-conectados'); hold on;
gimage = imshow(g3);
set(gimage,'AlphaData', 0.8);
Aprox_poligonal8(BW3);
