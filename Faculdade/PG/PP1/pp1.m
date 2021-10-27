clear all % Fecha todas as janelas.
clc % Limpa a mem�ria.
close all % Limpa a tela da �rea de trabalho.

% Jesimiel Efraim [726544]
% Lucas Henrique de Ara�jo [759521]
% Rafael Toledo [743590]
% Victor Mendes [756206]
% Vict�ria Resende [759539]

% --------------------------------- Autoescala ---------------------------------
function autoescala = autoescalar(img)
    [lin, col] = size(img); % Obt�m dimens�es da imagem.
    minPixel = min(min(img));
    maxPixel = max(max(img));
    autoescala = img;
    for i = 1 : lin
        for j = 1 : col
            autoescala(i, j) = round((255 / (maxPixel - minPixel)) * (img(i, j) - minPixel));
            if autoescala(i, j) > 255
                autoescala(i, j) = 255;
            elseif autoescala(i, j) < 0
                autoescala(i, j) = 0;
            endif
        endfor
    endfor
end

% -------------------------------- Quantiza��o ---------------------------------
function quantizacao = quantizar(img, niveisCinza)
    [lin, col] = size(img); % Obt�m dimens�es da imagem.
    minPixel = min(min(img));
    maxPixel = max(max(img));
    passo = round(maxPixel / niveisCinza);
    quantizacao = img;
    for i = 1 : lin
        for j = 1 : col
            quantizacao(i, j) = round(img(i, j) / passo) * passo;
            if quantizacao(i, j) > 255
                quantizacao(i, j) = 255;
            else
                if quantizacao(i, j) < 0
                    quantizacao(i, j) = 0;
                endif
            endif
        endfor
    endfor
end

% --------------------------------- Splitting ----------------------------------
function splitting = splitar(img, limiar, split)
    [lin, col] = size(img); % Obt�m dimens�es da imagem.
    splitting = img;
    for i = 1 : lin
        for j = 1 : col
            if img(i, j) <= limiar
                splitting(i, j) = img(i, j) - split;
            else
                splitting(i, j) = img(i, j) + split;
            endif
            
            if splitting(i, j) > 255
                splitting(i, j) = 255;
            elseif splitting(i, j) < 0
                splitting(i, j) = 0;
            endif
        endfor
    endfor
end

% -------------------------------- Binariza��o ---------------------------------
function binarizacao = binarizar(img, limiar)
    [lin, col] = size(img); % Obt�m dimens�es da imagem.
    binarizacao = img;
    for i = 1 : lin
        for j = 1 : col
            if img(i, j) >= limiar
                binarizacao(i, j) = 255;
            elseif img(i, j) < limiar
                binarizacao(i, j) = 0;
            endif
        endfor
    endfor
end

% ----------------------------------- Main -------------------------------------
for m = 1 : 5
    if m == 1
        titulo = "Rice";
        original = imread('rice.png'); % L� o arquivo.
        limiar = 110;
        split = 48;
        niveisCinza = 5;
    elseif m == 2
        titulo = "Mamografia";
        original = imread('mamografia.bmp'); % L� o arquivo.
        limiar = 39;
        split = 20;
        niveisCinza = 15;
    elseif m == 3
        titulo = "Batatas";
        original = imread('batatas.tif'); % L� o arquivo.
        limiar = 81;
        split = 30;
        niveisCinza = 6;
    elseif m == 4
        titulo = "Solda"
        original = imread('solda.bmp'); % L� o arquivo.
        limiar = 210;
        split = 20;
        niveisCinza = 8;
    elseif m == 5
        titulo = "Laranjas"
        original = imread('laranjas.bmp'); % L� o arquivo.
        limiar = 110;
        split = 30;
        niveisCinza = 5;
    endif;

    % Retorna 1 se a imagem � RGB e 0 se n�o for RGB.
    if isrgb(original) == 1
        img = rgb2gray(original); % Retorna a imagem em n�vel de cinza.
    else
        img = original;
    end
    
    autoescala = autoescalar(img);
    
    quantizacao = quantizar(img, niveisCinza);
    
    splitting = splitar(img, limiar, split);
    
    equalizacao = histeq(img);
    
    binarizacao = binarizar(img, limiar);
    
% ---------------------------------- Impress�o ---------------------------------

    % O 1� fator � o n�m de linhas, o 2� � o n�m de colunas (n� de gr�ficos) e o 3� onde vai imprimir.
    figure('Name', titulo),  
      subplot(2, 3, 1), subimage(img), title('Original');
      subplot(2, 3, 2), subimage(autoescala), title('Autoescala');
      subplot(2, 3, 3), subimage(quantizacao), title('Quantiza��o');
      subplot(2, 3, 4), subimage(splitting), title('Splitting');
      subplot(2, 3, 5), subimage(equalizacao), title('Equaliza��o do Histograma');
      subplot(2, 3, 6), subimage(binarizacao), title('Binariza��o');
    % O 1� fator � o n�m de linhas, o 2� � o n�m de colunas (n� de gr�ficos
endfor