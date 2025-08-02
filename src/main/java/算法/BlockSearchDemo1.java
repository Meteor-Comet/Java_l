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
        // 原始数据
        int[] arr = {16, 5, 9, 12, 21, 18, 37, 35, 42, 47, 50, 22, 67, 12, 90};
        System.out.println("原始数组: " + Arrays.toString(arr));
        
        // 先对数组进行排序，确保满足分块查找的条件
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);
        System.out.println("排序后数组: " + Arrays.toString(sortedArr));
        
        // 创建索引块
        Block[] blocks = createBlock(sortedArr, 3); // 分为3块
        
        System.out.println("索引块信息:");
        for (int i = 0; i < blocks.length; i++) {
            System.out.println("块 " + i + ": " + blocks[i]);
        }
        
        // 测试查找
        int target = 42;
        int index = blockSearch(sortedArr, blocks, target);
        System.out.println("\n元素 " + target + " 在数组中的位置是: " + index);
        
        target = 5;
        index = blockSearch(sortedArr, blocks, target);
        System.out.println("元素 " + target + " 在数组中的位置是: " + index);
        
        target = 100;
        index = blockSearch(sortedArr, blocks, target);
        System.out.println("元素 " + target + " 在数组中的位置是: " + index);
    }

    /**
     * 创建索引块
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
            
            // 找到当前块的最大值
            int max = arr[start];
            for (int j = start + 1; j <= end; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }
            
            blocks[i] = new Block(max, start, end);
        }
        
        return blocks;
    }

    /**
     * 分块查找算法
     * @param arr 原始数组（已排序）
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