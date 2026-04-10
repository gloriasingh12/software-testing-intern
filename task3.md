# Security Testing Report: Web Application Audit

**Objective:** To identify and mitigate common web vulnerabilities like SQL Injection (SQLi) and Cross-Site Scripting (XSS).

### 1. Vulnerability Assessment Summary
| Vulnerability | Type | Risk Level | Status |
| :--- | :--- | :--- | :--- |
| SQL Injection | Backend | Critical | Identified & Patched |
| Cross-Site Scripting (XSS) | Frontend | High | Identified & Patched |
| Broken Authentication | Session | Medium | Resolved |

### 2. Detailed Findings

#### A. SQL Injection (SQLi)
- **Description:** Found in the login form where input was not sanitized. An attacker could bypass login using `' OR '1'='1`.
- **Mitigation:** Implemented **Prepared Statements** and **Parameterized Queries** to ensure user input is never executed as code.

#### B. Cross-Site Scripting (XSS)
- **Description:** Detected in the comment section. Malicious scripts could be injected and executed in other users' browsers.
- **Mitigation:** Applied **Input Validation** and **Output Encoding** (escaping HTML tags) to prevent script execution.

### 3. Mitigation Strategies Implemented
1. **Input Sanitization:** All user inputs are stripped of dangerous characters.
2. **Use of HTTPS:** Ensured data encryption in transit.
3. **Security Headers:** Added `Content-Security-Policy` (CSP) to restrict unauthorized script sources.

**Deliverable:** Complete Security Audit log and patched source code recommendations.
