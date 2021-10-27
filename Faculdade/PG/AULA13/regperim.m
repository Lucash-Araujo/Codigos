%aplicando o regionprops
clear all
close all
clc
img=imread('rice_binary.png');
figure, imshow(img);
imgperim=bwperim(img,8);
figure, imshow(imgperim);
imglabel = bwlabel(imgperim,4);

for k=1:max(imglabel(:));
    imzero=zeros(size(img));
    [r,c] = find(imglabel == k);
    for w=1:size(r,1)
        imzero(r(w),c(w))=1;
    end
    figure, imshow(imzero);
    if k==max(imglabel(:))
        disp('parou')
    end
end