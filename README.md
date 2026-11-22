
##  The 10 Finance Programs (Formulas Cheat Sheet)

1. **Simple Interest:** `(P * R * T) / 100`
2. **Compound Interest:** `A = P * (1 + r/n)^(n*t)`, then subtract `P` to get the interest.
3. **Loan EMI:** `[P * r * (1+r)^n] / [(1+r)^n - 1]` (where `r` is monthly interest rate and `n` is tenure in months).
4. **GST Split:** 
   - Same state (Intrastate) $\rightarrow$ Split equally into **CGST** and **SGST** (e.g., 9% + 9%).
   - Different state (Interstate) $\rightarrow$ Full tax charged as **IGST** (18%).
5. **Bill Discount:** Subtract percentage or flat discount from bill total (cannot go below ₹0).
6. **Round Off:** Use `Math.round()` to round to the nearest whole rupee (0.50 and above rounds up).
7. **Income Tax Slabs:** Calculate tax step-by-step for each bracket, not a single flat percentage on the whole salary.
8. **Indian Currency Format:** Format numbers with Indian commas (`₹1,23,456.00` instead of `123,456.00`) using Java's Indian locale (`Locale("en", "IN")`).
9. **Profit Percentage:** `((Selling Price - Cost Price) / Cost Price) * 100` (ensure cost price > 0).
10. **Bill Total:** Loop through an array of item prices and add them up, checking for negative numbers.

---
