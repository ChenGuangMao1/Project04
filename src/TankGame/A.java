package TankGame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class A {
    static class ChunkData {
        private final int chunkSeq;
        private final byte[] data;

        public ChunkData(int chunkSeq, byte[] data) {
            this.chunkSeq = chunkSeq;
            this.data = data;
        }

        public int getChunkSeq() { return chunkSeq; }
        public byte[] getData() { return data; }
    }
    private static final Map<String, List<ChunkData>> fileChunks = new ConcurrentHashMap<>();
    private static B b = new B();

    public static void main(String[] args) {
        // 缓存该分块
        String fileId = null;
        int chunkSeq = 0;
        byte[] data = new byte[0];
        fileChunks.computeIfAbsent(fileId, k -> new ArrayList<>())
                .add(new ChunkData(chunkSeq, data));
        // 创建A类的对象a
        A a = new A();
        // 调用b对象的make方法
        b.make();
        byte[] bytes = new byte[10];
        bytes[0] = 3;
        System.out.println(Arrays.copyOf( bytes, 1)[0]);
    }
}


