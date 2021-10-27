clear all, close all, clc
rect=[ 5,5,100,100];
A=imread('trees.png');
A=mat2gray(A);
Y1=imcrop(A,rect);
BW1=im2bw(Y1,0.5);
figure, imshow(A);
figure, imshow(BW1);

B=imread('kids.png');
B=mat2gray(B);
Y2=imcrop(B,rect);
BW2=im2bw(Y2,0.3);
figure, imshow(B)
figure, imshow(BW2)

C=imread('forest.png');
C=mat2gray(C);
Y3=imcrop(C,rect);
BW3=im2bw(Y3,0.5);
figure, imshow(C)
figure, imshow(BW3)

 figure, subplot(2,3,1), imshow(BW1), title('BW1')
 subplot(2,3,2), imshow(BW2), title('BW2')
 subplot(2,3,3), imshow(BW3), title('BW3')
 subplot(2,3,4), imshow(BW1+BW2), title('BW1+BW2')
 subplot(2,3,5), imshow(BW1+BW3), title('BW1+BW3')
 subplot(2,3,6), imshow(BW2+BW3), title('BW2+BW3')
% 
 figure, subplot(3,3,1), imshow(BW1), title('BW1')
 subplot(3,3,2), imshow(BW2), title('BW2')
 subplot(3,3,3), imshow(BW3), title('BW3')
 subplot(3,3,4), imshow(BW1-BW2), title('BW1-BW2')
 subplot(3,3,5), imshow(BW2-BW1), title('BW2-BW1')
 subplot(3,3,6), imshow(BW3-BW1), title('BW3-BW1')
 subplot(3,3,7), imshow(BW1-BW3), title('BW1-BW3')
 subplot(3,3,8), imshow(BW2-BW3), title('BW2-BW3')
 subplot(3,3,9), imshow(BW3-BW2), title('BW3-BW2')

figure, subplot(2,3,1), imshow(Y1), title('Y1')
subplot(2,3,2), imshow(Y2), title('Y2')
subplot(2,3,3), imshow(Y3), title('Y3')
subplot(2,3,4), imshow(Y1.*Y2), title('Y1*Y2')
subplot(2,3,5), imshow(Y1.*Y3), title('Y1*Y3')
subplot(2,3,6), imshow(Y2.*Y3), title('Y2*Y3')

figure, subplot(3,3,1), imshow(Y1), title('Y1')
subplot(3,3,2), imshow(Y2), title('Y2')
subplot(3,3,3), imshow(Y3), title('Y3')
subplot(3,3,4), imshow(Y1./Y2), title('Y1/Y2')
subplot(3,3,5), imshow(Y2./Y1), title('Y2/Y1')
subplot(3,3,6), imshow(Y3./Y1), title('Y3/Y1')
subplot(3,3,7), imshow(Y1./Y3), title('Y1/Y3')
subplot(3,3,8), imshow(Y2./Y3), title('Y2/Y3')
subplot(3,3,9), imshow(Y3./Y2), title('Y3/Y2')

figure, subplot(2,3,1), imshow(BW1), title('BW1')
subplot(2,3,2), imshow(BW2), title('BW2')
subplot(2,3,3), imshow(BW3), title('BW3')
subplot(2,3,4), imshow(BW1&BW2), title('BW1 and BW2')
subplot(2,3,5), imshow(BW1&BW3), title('BW1 and BW3')
subplot(2,3,6), imshow(BW2&BW3), title('BW2 and BW3')


figure, subplot(2,3,1), imshow(BW1), title('BW1')
subplot(2,3,2), imshow(BW2), title('BW2')
subplot(2,3,3), imshow(BW3), title('BW3')
subplot(2,3,4), imshow((xor(BW1,BW2))), title('BW1 xor BW2')
subplot(2,3,5), imshow((xor(BW1,BW3))), title('BW1 xor BW3')
subplot(2,3,6), imshow((xor(BW2,BW3))), title('BW2 xor BW3')

figure, subplot(2,3,1), imshow(BW1), title('BW1')
subplot(2,3,2), imshow(BW2), title('BW2')
subplot(2,3,3), imshow(BW3), title('BW3')
subplot(2,3,4), imshow(BW1|BW2), title('BW1 ou BW2')
subplot(2,3,5), imshow(BW1|BW3), title('BW1 ou BW3')
subplot(2,3,6), imshow(BW2|BW3), title('BW2 ou BW3')