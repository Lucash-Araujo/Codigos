clear all
close all
clc

im=imread('Fratura-de-punho-RX.jpg');
[lin col]=size(im);

new_img=zeros(lin,col);
crop_img=imcrop(im,[60 40 100 90]);

bw_full=im2bw(im,0.5); %limiar para a imagem full
bw_crop=im2bw(crop_img,0.55); %limiar somente para a imagem recortada

figure,
subplot(2,3,1), imshow(im), title('Imagem original');
subplot(2,3,2), imhist(im), title('Histograma da imagem original');
subplot(2,3,3), imshow(bw_full); title('Imagem original bw');
subplot(2,3,4), imshow(crop_img), title('Imagem recortada');
subplot(2,3,5), imhist(crop_img), title('Histograma da imagem recortada');
subplot(2,3,6), imshow(bw_crop); title('Imagem recortada bw')

[lin col]=size(bw_crop);
new_img=bw_full;
for i=1:lin
    for j=1:col
        new_img(39+i,59+j)=bw_crop(i,j);
    end
end
figure, imshow(bw_full), title('Imagem original');
figure, imshow(new_img), title('Imagem recortada bw + original bw');
