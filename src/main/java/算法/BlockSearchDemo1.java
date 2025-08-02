package 算法;

import java.util.Arrays;

public class BlockSearchDemo1 {
    // 索引块类
    static class Block {
        private int max;     // 块中的最大值
        private int start;   // 块的起始位置
        private int end;     // 块的结束位置

        public Block(int max, int start, int end) {
            this.max = max;
            this.start = start;
            this.end = end;
        }

        public int getMax() {
            return max;
        }

        public int getStart() {
            return start;
        }

        public int getEnd() {
            return end;
        }

        @Override
        public String toString() {
            return "Block{max=" + max + ", start=" + start + ", end=" + end + "}";
        }
    }

    public static void main(String[] args) {
        // 原始数据（已经按分块结构组织）
        // 假设我们有以下数据，分为3块：
        // 块1: {5, 12, 9, 16} (最大值16)
        // 块2: {18, 21, 37, 35} (最大值37) 
        // 块3: {42, 47, 50, 67, 90, 22} (最大值90)
        // 满足条件：前一块的所有元素 <= 后一块的所有元素 (16 <= 18, 37 <= 42)
        int[] arr = {5, 12, 9, 16, 18, 21, 37, 35, 42, 47, 50, 67, 90, 22};
        
        System.out.println("原始数组: " + Arrays.toString(arr));
        
        // 手动创建索引块（根据数据的实际分块结构）
        Block[] blocks = new Block[3];
        blocks[0] = new Block(16, 0, 3);   // 块1: 索引0-3，最大值16
        blocks[1] = new Block(37, 4, 7);   // 块2: 索引4-7，最大值37
        blocks[2] = new Block(90, 8, 13);  // 块3: 索引8-13，最大值90
        
        System.out.println("索引块信息:");
        for (int i = 0; i < blocks.length; i++) {
            System.out.println("块 " + i + ": " + blocks[i]);
        }
        
        // 测试查找
        int target = 37;
        int index = blockSearch(arr, blocks, target);
        System.out.println("\n元素 " + target + " 在数组中的位置是: " + index);
        
        target = 9;
        index = blockSearch(arr, blocks, target);
        System.out.println("元素 " + target + " 在数组中的位置是: " + index);
        
        target = 22;
        index = blockSearch(arr, blocks, target);
        System.out.println("元素 " + target + " 在数组中的位置是: " + index);
        
        target = 100;
        index = blockSearch(arr, blocks, target);
        System.out.println("元素 " + target + " 在数组中的位置是: " + index);
        
        System.out.println("\n========================");
        System.out.println("对比：排序后分块查找");
        
        // 对比：排序后的分块查找
        int[] arr2 = {16, 5, 9, 12, 21, 18, 37, 35, 42, 47, 50, 22, 67, 12, 90};
        System.out.println("原始数组: " + Arrays.toString(arr2));
        
        // 先对数组进行排序，确保满足分块查找的条件
        int[] sortedArr = arr2.clone();
        Arrays.sort(sortedArr);
        System.out.println("排序后数组: " + Arrays.toString(sortedArr));
        
        // 创建索引块
        Block[] sortedBlocks = createBlock(sortedArr, 3); // 分为3块
        
        System.out.println("索引块信息:");
        for (int i = 0; i < sortedBlocks.length; i++) {
            System.out.println("块 " + i + ": " + sortedBlocks[i]);
        }
        
        // 测试查找
        target = 37;
        index = blockSearch(sortedArr, sortedBlocks, target);
        System.out.println("\n元素 " + target + " 在数组中的位置是: " + index);
    }

    /**
     * 创建索引块（用于已排序数组）
     * @param arr 原始数组（已排序）
     * @param blockNum 块的数量
     * @return 索引块数组
     */
    public static Block[] createBlock(int[] arr, int blockNum) {
        Block[] blocks = new Block[blockNum];
        int blockSize = arr.length / blockNum;
        if (arr.length % blockNum != 0) {
            blockSize++; // 如果不能整除，每块大小加1
        }

        for (int i = 0; i < blockNum; i++) {
            int start = i * blockSize;
            int end = Math.min(start + blockSize - 1, arr.length - 1);
            
            // 找到当前块的最大值（由于数组已排序，最大值即为块的最后一个元素）
            int max = arr[end];
            
            blocks[i] = new Block(max, start, end);
        }
        
        return blocks;
    }

    /**
     * 分块查找算法
     * @param arr 原始数组
     * @param blocks 索引块数组
     * @param target 目标值
     * @return 目标值在数组中的索引，未找到返回-1
     */
    public static int blockSearch(int[] arr, Block[] blocks, int target) {
        // 1. 确定目标值可能在哪一块
        int blockIndex = -1;
        for (int i = 0; i < blocks.length; i++) {
            if (target <= blocks[i].getMax()) {
                blockIndex = i;
                break;
            }
        }
        
        // 如果没有找到合适的块，说明目标值不存在
        if (blockIndex == -1) {
            return -1;
        }
        
        // 2. 在确定的块内进行顺序查找
        Block targetBlock = blocks[blockIndex];
        for (int i = targetBlock.getStart(); i <= targetBlock.getEnd(); i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        
        return -1; // 未找到
    }
}