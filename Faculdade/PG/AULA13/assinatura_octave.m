pkg load image

%limpar area
clear, clc, close all

%carrega imagens, binariza mostra imagem original
im1 = imread('img2.bmp');
im1 = im2bw(im1,graythresh(im1));

%reconhece e destaca as bordas, plota o número do objeto no centróide
[B1,L1,N1] = bwboundaries(~im1);
figure, imshow(im1);
for cnt = 1:N1
    hold on;
        boundary1 = B1{cnt};
        plot(boundary1(:,2), boundary1(:,1),'r');
    hold on;
        text(mean(boundary1(:,2)), mean(boundary1(:,1)),num2str(cnt), 'Color', 'red');
end

%plota a função assinatura
figure;
if mod(N1,2)==0
    subplotrow = ceil(sqrt(N1));
else
    subplotrow = ceil(sqrt(N1)+1);
end

for cnt = 1:N1
    boundary1 = B1{cnt};
    [th, r]=cart2pol(boundary1(:,2)-mean(boundary1(:,2)), ...
    boundary1(:,1)-mean(boundary1(:,1)));
    subplot(subplotrow,round(N1/subplotrow),cnt);
    %subplot(subplotrow,round(N1/subplotrow),cnt);
    
    plot(th,r,'.');
    axis([-pi pi 0 50]);
    xlabel('radiano');ylabel('r');
    title(['Objeto ', num2str(cnt)]);
end