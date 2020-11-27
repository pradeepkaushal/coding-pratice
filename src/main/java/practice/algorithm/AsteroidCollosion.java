package practice.algorithm;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/** https://massivealgorithms.blogspot.com/2018/04/leetcode-735-asteroid-collision.html */
class AsteroidCollision {
  public static void main(String[] args) {
    //
    int[] arr = {10, 2, -5};

    AsteroidCollision main = new AsteroidCollision();
    int[] ints = main.asteroidCollision(arr);
    System.out.println(ints);
  }

  public int[] asteroidCollision(int[] asteroids) {
    if (asteroids.length == 0) {
      return asteroids;
    }
    Deque<Integer> stack = new ArrayDeque<>();
    stack.push(asteroids[0]);

    for (int i = 1; i < asteroids.length; i++) {
      if (stack.peek() < 0 || asteroids[i] > 0) {
        stack.push(asteroids[i]);
      } else {
        while (true) {
          if ((i < asteroids.length) && (stack.peek() <= Math.abs(asteroids[i]))) {
            Integer pop = stack.pop();
            if (stack.isEmpty() && pop < Math.abs(asteroids[i])) {
              stack.push(asteroids[i]);
            }
            i++;
          } else {
            break;
          }
        }
      }
    }

    int[] arr = new int[stack.size()];

    for (int i = stack.size() - 1; i >= 0; i--) {
      arr[i] = stack.pop();
    }
    return arr;
  }

  public int[] asteroidCollision1(int[] asteroids) {
    if (asteroids.length < 2) {
      return asteroids;
    }
    int index = 1;
    int end = 0;
    while (index < asteroids.length) {
      if (end == -1) {
        asteroids[0] = asteroids[index];
        end = 0;
        index++;
        continue;
      } else {
        if (asteroids[end] > 0 && asteroids[index] < 0) {
          if (Math.abs(asteroids[end]) == Math.abs(asteroids[index])) {
            end--;
            index++;
          } else if (Math.abs(asteroids[end]) > Math.abs(asteroids[index])) {
            index++;
          } else {
            end--;
          }
        } else {
          end++;
          asteroids[end] = asteroids[index];
          index++;
        }
      }
    }

    return Arrays.copyOf(asteroids, end + 1);
  }
}
