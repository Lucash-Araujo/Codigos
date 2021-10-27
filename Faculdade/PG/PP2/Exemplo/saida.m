## Grupo 8
# Beatriz Gonçalves de Carvalho RA:761070
# Franciene Bernardi RA:761851
# Vinícius Pereira Aiala RA:759544

pkg load image

clear all
close all
clc

function processa (img)
  s = regionprops(img, 'MajorAxisLength','MinorAxisLength', 'Perimeter','Area', 'EulerNumber')
  exc = s.MajorAxisLength / s.MinorAxisLength;
  comp = s.Perimeter * s.Perimeter / s.Area;
  bwesq = bwmorph(img,'skel',Inf);
  disp("Excentricidade:")
  disp(exc)
  disp("Compacidade:")
  disp(comp)
  figure, imshow(bwesq);
endfunction

disp("0")
%Compacidade
img=im2bw(imread('0.png'));
processa(img);

disp("1")
%Excentricidade
img=im2bw(imread('1.png'));
processa(img);

disp("2")
%Esqueletonização
img=im2bw(imread('2.png'));
processa(img);

disp("3")
%Esqueletonização
img=im2bw(imread('3.png'));
processa(img);

disp("4")
%Esqueletonização
img=im2bw(imread('4.png'));
processa(img);

disp("5")
%Esqueletonização
img=im2bw(imread('5.png'));
processa(img);

disp("6")
img=im2bw(imread('6.png'));
processa(img);

disp("7")
%Esqueletonização
img=im2bw(imread('7.png'));
processa(img);

disp("8")
%Euler
img=im2bw(imread('8.png'));
processa(img);

disp("9")
img=im2bw(imread('9.png'));
processa(img);
