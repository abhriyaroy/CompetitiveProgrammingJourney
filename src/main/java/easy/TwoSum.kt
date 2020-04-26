package easy

import java.lang.IllegalArgumentException

/**
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

 **/

class Twosum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val holder: HashMap<Int, Int> = hashMapOf()

        for (i in nums.indices) {
            if (holder.contains(target - nums[i])) {
                return intArrayOf(holder[target - nums[i]]!!, i)
            } else {
                holder[nums[i]] = i
            }
        }
        throw  IllegalArgumentException()
    }
}