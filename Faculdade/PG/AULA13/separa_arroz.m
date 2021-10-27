close all; clear('all'); clc;
I = imread('rice_binary.png');
s = regionprops(I, 'PixelList');

for k = 1 : size(s,1)
	new = zeros(size(I)); 
	v = s(k).PixelList; 
	for j = 1 : size(v, 1) 
	new(v(j, 1), v(j, 2)) = 1; 
	end 
figure, imshow(new); 
end
