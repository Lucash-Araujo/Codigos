clc, clear all, close all;
pkg load image

Inf = 100;

Edges = im2bw(imread('Imagens/5.png'));
Edges = bwmorph(Edges, 'skel',Inf);

figure, imshow(~Edges);
hold on
b = bwboundaries(Edges);
[boundarycount, asdf] = size(b);

grid = 10;
%0 0124567  
%1 023467   88  110
%2 01234567 118 178
%3 01234567 140 171
%4 0234567  
%5 01234567 118 158
%6 012456   
%7 023467   98  105
%8 023467   
%9 0234567  
for k=1:boundarycount
    j=0;
    array = [];
    [rows, columns] = size(b{k,1});
    for i=1:rows-1
        y = round(b{k,1}(i,1)/grid);
        x = round(b{k,1}(i,2)/grid);
        y2 = round(b{k,1}(i+1,1)/grid);
        x2 = round(b{k,1}(i+1,2)/grid);

        dx = x2 - x;
        dy = y2 - y;
        if not(dx == 0 && dy==0)
            plot(x*grid, y*grid, 'Marker', '.', 'Color', [0 0 1], 'MarkerSize', 5);
            plot([x*grid,x2*grid],[y*grid,y2*grid],'Color','r','LineWidth',2);
            j = j+1;
            if (dx == 1 && dy ==0)
               array(j) = 0;
            end
            if (dx == 1 && dy ==1)
               array(j) = 1;
            end
            if (dx == 0 && dy ==1)
               array(j) = 2;
            end
            if (dx == -1 && dy ==1)
               array(j) = 3;
            end
            if (dx == -1 && dy ==0)
               array(j) = 4;
            end
            if (dx == -1 && dy ==-1)
               array(j) = 5;
            end
            if (dx == 0 && dy ==-1)
               array(j) = 6; 
            end
            if (dx == 1 && dy ==-1)
               array(j) = 7; 
            end
            text((x+0.5)*grid, (y+0.5)*grid,num2str(array(j)),'FontSize',9,'Color',[0 .5 0]);
        end
        
    end;
end;
hold off
