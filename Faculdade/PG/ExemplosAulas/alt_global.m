
pkg load image;
A=imread('imagens/cacau_escuro.tif'); % Ler o arquivo
cte_brilho=50;
fmax = max(max(A));
fmin = min(min(A));
g = 255/(fmax-fmin)
figure, imshow(A); % mostrar a imagem
figure, imhist(A);
[lin col]=size(A); % obtém dimensões da imagem
for i=1:lin
    for j=1:col
        B(i,j)=g*(A(i,j)-fmin);
        if B(i,j)>255
            B(i,j)=255;
        else
            if B(i,j)<0
                B(i,j)=0;
            end
        end
    end
end
figure, imhist(B);
figure, imshow(B);
