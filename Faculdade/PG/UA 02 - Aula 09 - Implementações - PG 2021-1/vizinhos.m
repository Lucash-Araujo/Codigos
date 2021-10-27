clear all; close all; clc;
 
size_template = 5;
k_vizinhos   = 17;
 
A = imread('lena.bmp');
A=rgb2gray(A);
A = mat2gray(A);
figure, imshow(A), title('Original');
A = imnoise(A, 'salt & pepper', 0.4);
figure, imshow(A), title('com ruído');
[lin, col] = size(A);
% Armazena as primeiras e últimas linhas/colunas
first_lin = fix(size_template / 2) + 1;
last_lin  = lin - fix(size_template / 2) - 1;
first_col = fix(size_template / 2) + 1;
last_col  = col - fix(size_template / 2) - 1;
  
for x = first_lin : 1 : last_lin
    for y = first_col : 1 : last_col
        % Armazena a janela da vizinhança
        B=A(1 + x-fix(size_template/2):x+fix(size_template/2) + 1, 1 + y-fix(size_template/2):y+fix(size_template/2) + 1);
% Transforma a janela em um vetor e armazena sua dimensão
        B = ( B(:)' );
        tam = length(B);
        
% Calcula o módulo da diferença entre o central e os vizinhos
        C = B - B(fix( tam / 2 ));
        C = abs(C);
        
% Ordena o vetor crescentemente
        [f, f2] = sort(C, 'ascend');

% Calcula a média dos k-vizinhos mais próximos do central
        pixel = sum(B(f2(1 : k_vizinhos)) ) / k_vizinhos;
        
% Substitui o pixel central pelo resultante dos k vizinhos
        I(x, y) = pixel;
    end
end
 
figure, imshow(I), title('Filtrada');
