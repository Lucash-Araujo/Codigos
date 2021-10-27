%Limpando a área
clear
close all
clc
%pkg load image %poderemos adicionar a chamada do pacote a um script

%Criando uma imagem com níveis de cinza
C = (0:255)/255;
gray = [C; C; C; C; C; C; C; C; C; C; C; C; C; C; C; C];

figure; imshow(gray), title('Níveis de Cinza');

%Criando uma imagem com níveis de vermelho
C = (0:255)/255;
red = [C; C; C; C; C; C; C; C; C; C; C; C; C; C; C; C];

figure; imshow(red), title('Níveis de Vermelho');
redmap = colormap(autumn);

%Criando uma imagem com níveis de verde
C = (0:255)/255;
green = [C; C; C; C; C; C; C; C; C; C; C; C; C; C; C; C];

figure; imshow(green), title('Níveis de Verde');
greenmap = colormap(summer);

%Criando uma imagem com níveis de azul
C = (0:255)/255;
blue = [C; C; C; C; C; C; C; C; C; C; C; C; C; C; C; C];

figure; imshow(blue), title('Níveis de Azul');
bluemap = colormap(winter);

%Criando uma imagem com níveis RGB
C = (0:255)/255;
rgb = [C; C; C; C; C; C; C; C; C; C; C; C; C; C; C; C];

figure; imshow(rgb), title('Níveis RGB');
rgbmap = colormap(jet);