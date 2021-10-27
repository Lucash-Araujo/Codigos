## Grupo 8
# Beatriz Gonçalves de Carvalho RA:761070
# Franciene Bernardi RA:761851
# Vinícius Pereira Aiala  RA:759544

pkg load image

clear all
close all
clc
    
figure;
img=im2bw(imread('0.png'));
s = regionprops(img, 'MajorAxisLength','MinorAxisLength', 'Perimeter','Area', 'EulerNumber')
exc = s.MajorAxisLength / s.MinorAxisLength;
comp = s.Perimeter * s.Perimeter / s.Area;
titulo = strcat("0 - Compacidade: ", mat2str(s.Area, 4));
subplot(1, 1, 1), imshow(img);
    title (titulo);
    
figure;
img=im2bw(imread('1.png'));
s = regionprops(img, 'MajorAxisLength','MinorAxisLength', 'Perimeter','Area', 'EulerNumber')
exc = s.MajorAxisLength / s.MinorAxisLength;
comp = s.Perimeter * s.Perimeter / s.Area;
titulo = strcat("1 - Excentricidade: ", mat2str(s.Area, 4));
subplot(1, 1, 1), imshow(img);
    title (titulo);
    
figure;
img=im2bw(imread('2.png'));
bwesq = bwmorph(img,'thin',Inf);
s = regionprops(img, 'MajorAxisLength','MinorAxisLength', 'Perimeter','Area', 'EulerNumber')
exc = s.MajorAxisLength / s.MinorAxisLength;
comp = s.Perimeter * s.Perimeter / s.Area;
titulo = strcat("8 - Número de Euler: ", mat2str(s.Area, 4));
subplot(1, 2, 1), imshow(img);
    title (titulo);
subplot(1, 2, 2), imshow(bwesq);
    title ("Esqueletonização");
    
figure;
img=im2bw(imread('3.png'));
bwesq = bwmorph(img,'thin',Inf);
s = regionprops(img, 'MajorAxisLength','MinorAxisLength', 'Perimeter','Area', 'EulerNumber')
exc = s.MajorAxisLength / s.MinorAxisLength;
comp = s.Perimeter * s.Perimeter / s.Area;
titulo = strcat("8 - Número de Euler: ", mat2str(s.Area, 4));
subplot(1, 2, 1), imshow(img);
    title (titulo);
subplot(1, 2, 2), imshow(bwesq);
    title ("Esqueletonização");
    
figure;
img=im2bw(imread('4.png'));
bwesq = bwmorph(img,'thin',Inf);
s = regionprops(img, 'MajorAxisLength','MinorAxisLength', 'Perimeter','Area', 'EulerNumber')
exc = s.MajorAxisLength / s.MinorAxisLength;
comp = s.Perimeter * s.Perimeter / s.Area;
titulo = strcat("8 - Número de Euler: ", mat2str(s.Area, 4));
subplot(1, 2, 1), imshow(img);
    title (titulo);
subplot(1, 2, 2), imshow(bwesq);
    title ("Esqueletonização");
    
    
figure;
img=im2bw(imread('5.png'));
bwesq = bwmorph(img,'thin',Inf);
s = regionprops(img, 'MajorAxisLength','MinorAxisLength', 'Perimeter','Area', 'EulerNumber')
exc = s.MajorAxisLength / s.MinorAxisLength;
comp = s.Perimeter * s.Perimeter / s.Area;
titulo = strcat("8 - Número de Euler: ", mat2str(s.Area, 4));
subplot(1, 2, 1), imshow(img);
    title (titulo);
subplot(1, 2, 2), imshow(bwesq);
    title ("Esqueletonização");
    
figure;
img=im2bw(imread('6.png'));
bwesq = bwmorph(img,'thin',Inf);
s = regionprops(img, 'MajorAxisLength','MinorAxisLength', 'Perimeter','Area', 'EulerNumber')
exc = s.MajorAxisLength / s.MinorAxisLength;
comp = s.Perimeter * s.Perimeter / s.Area;
titulo = strcat("8 - Número de Euler: ", mat2str(s.Area, 4));
subplot(1, 2, 1), imshow(img);
    title (titulo);
subplot(1, 2, 2), imshow(bwesq);
    title ("Esqueletonização");
    
figure;
img=im2bw(imread('7.png'));
bwesq = bwmorph(img,'thin',Inf);
s = regionprops(img, 'MajorAxisLength','MinorAxisLength', 'Perimeter','Area', 'EulerNumber')
exc = s.MajorAxisLength / s.MinorAxisLength;
comp = s.Perimeter * s.Perimeter / s.Area;
titulo = strcat("8 - Número de Euler: ", mat2str(s.Area, 4));
subplot(1, 2, 1), imshow(img);
    title (titulo);
subplot(1, 2, 2), imshow(bwesq);
    title ("Esqueletonização");
    
figure;
img=im2bw(imread('8.png'));
s = regionprops(img, 'MajorAxisLength','MinorAxisLength', 'Perimeter','Area', 'EulerNumber')
exc = s.MajorAxisLength / s.MinorAxisLength;
comp = s.Perimeter * s.Perimeter / s.Area;
titulo = strcat("8 - Número de Euler: ", mat2str(s.Area, 4));
subplot(1, 1, 1), imshow(img);
    title (titulo);
    
figure;
img=im2bw(imread('9.png'));
bwesq = bwmorph(img,'thin',Inf);
s = regionprops(img, 'MajorAxisLength','MinorAxisLength', 'Perimeter','Area', 'EulerNumber')
exc = s.MajorAxisLength / s.MinorAxisLength;
comp = s.Perimeter * s.Perimeter / s.Area;
titulo = strcat("8 - Número de Euler: ", mat2str(s.Perimeter, 4));
subplot(1, 2, 1), imshow(img);
    title (titulo);
subplot(1, 2, 2), imshow(bwesq);
    title ("Esqueletonização");