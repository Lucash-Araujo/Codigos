%aplicando o regionprops
clear all
close all
clc
img=imread('rice_binary.png');
figure, imshow(img);
s = regionprops(img, 'Orientation', 'MajorAxisLength','MinorAxisLength','Centroid','Area')
figure, imshow(img)
hold on

%aplicando uma elipse ao redor de cada objeto
phi = linspace(0,2*pi,50);
cosphi = cos(phi);
sinphi = sin(phi);

for k = 1:length(s)
    xbar = s(k).Centroid(1);
    ybar = s(k).Centroid(2);

    a = s(k).MajorAxisLength/2;
    b = s(k).MinorAxisLength/2;

    theta = pi*s(k).Orientation/180;
    R = [ cos(theta)   sin(theta)
        -sin(theta)   cos(theta)];

    xy = [a*cosphi; b*sinphi];
    xy = R*xy;

    x = xy(1,:) + xbar;
    y = xy(2,:) + ybar;

    plot(x,y,'r','LineWidth',2);
end
hold off