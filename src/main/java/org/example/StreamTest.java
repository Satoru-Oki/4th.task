package org.example;

import java.util.stream.IntStream;

public class StreamTest {

    public static void main(String[] args) {
        //ピラミッドの高さの決定・ループ
        IntStream.range(0, 10).forEachOrdered(i -> {
            //行ごとのスペース・アスタリスクの間隔処理
            IntStream.of(10 - (i + 1), 20 - (i * 2 + 1), 20 - (i * 2 + 1)).forEach(i1 -> {
                //スペースの描画処理
                IntStream.range(0, i1).mapToObj(j -> " ").forEach(System.out::print);
                //アスタリスクの描画処理（奇数個の出力）
                IntStream.range(0, (i + 1) * 2 - 1).mapToObj(k -> "*").forEach(System.out::print);
            });
            System.out.println();
        });
    }
}
