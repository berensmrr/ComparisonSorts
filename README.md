# Comparison of Tim Sort and Quick Sort
### CME 2204 - Algorithm Analysis | Assignment 1 | 2025-2026 Spring

This project implements and compares **Tim Sort** and **Quick Sort** (with 5 pivot strategies) on 1,000,000 integers across four different input types.

## Project Structure
---

## Algorithms

**Tim Sort** — Hybrid algorithm combining Merge Sort and Insertion Sort. Divides the array into runs of size 32, sorts each with Insertion Sort, then merges using Merge Sort. Stable.

**Quick Sort** — Iterative implementation using an explicit stack. Five pivot strategies:
- First Element
- Last Element
- Middle Element
- Random Element
- Median of three (first, middle, last)

---

## Performance Results (ms)

| Algorithm | Random | Semi-Ordered | Increasing | Decreasing |
|---|---|---|---|---|
| Tim Sort | 150 | 82 | 33 | 41 |
| QS - First | 78 | 61 | 189,236 ⚠️ | 254,052 ⚠️ |
| QS - Last | 85 | 61 | 412,812 ⚠️ | 310,329 ⚠️ |
| QS - Middle | 78 | 57 | **16** ✅ | **17** ✅ |
| QS - Random | 78 | 70 | 30 | 34 |
| QS - Median | 80 | 56 | **16** ✅ | 31 |

> ⚠️ First/Last pivot on sorted data triggers O(n²) worst case.

---

## How to Run

1. Place `random.txt` and `semi_ordered.txt` in the project root
2. Open project in IntelliJ IDEA
3. Run `Main.java`
4. 24 output files will be generated in the project root

---

## Key Findings
- **Fastest:** QS Middle/Median on sorted data (16 ms)
- **Most reliable:** Tim Sort — consistent across all input types
- **Slowest:** QS Last on increasing data (412,812 ms ≈ 6.8 minutes)
- First/Last pivot should never be used on potentially sorted inputs

---

## Hardware
- CPU: Intel Core i7-10750H @ 2.60GHz | RAM: 16 GB | OS: Windows 11 | Java: JDK 25
