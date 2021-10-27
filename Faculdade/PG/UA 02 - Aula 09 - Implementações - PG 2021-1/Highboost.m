clear all
clc
close all
%J=imread('kids.tif');
J=imread('fd_olho.jpg');
J=rgb2gray(J);
p1 = 1.1;
p2 = 1.15;
p3 = 1.2;
w1 = 9*p1 - 1;
w2 = 9*p2 - 1;
w3 = 9*p3 - 1;
m1 = [-1 -1 -1; -1 w1 -1; -1 -1 -1];
m2 = [-1 -1 -1; -1 w2 -1; -1 -1 -1];
m3 = [-1 -1 -1; -1 w3 -1; -1 -1 -1];
N = 255;
L1=filter2(m1,J);
[lin, col] = size(L1); 
for i=1:lin
	for j=1:col 
		if L1(i,j)<0 
			L1(i,j)=0;
        elseif L1(i,j)>N
            L1(i,j)=N;
       end
	end
end
L1 = L1/N;
L2=filter2(m2,J);
[lin, col] = size(L2);
for i=1:lin
	for j=1:col 
		if L2(i,j)<0 
			L2(i,j)=0; 
        elseif L2(i,j)>N
            L2(i,j)=N;
		end
	end
end
L2 = L2/N;
L3=filter2(m3,J);
[lin, col] = size(L3);
for i=1:lin
    for j=1:col
        if L3(i,j)<0
            L3(i,j)=0;
        elseif L3(i,j)>N
            L3(i,j)=N;
        end
    end
end
L3 = L3/N;
subplot(2,2,1), imshow(J)
subplot(2,2,2), imshow(L1)
subplot(2,2,3), imshow(L2)
subplot(2,2,4), imshow(L3)






