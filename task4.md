# Load Testing Report: Gatling Simulation

**Objective:** To analyze system performance and stability under heavy simulated traffic.

### 1. Simulation Parameters
- **Tool:** Gatling (Scala/Java)
- **Simulated Users:** 5,000 Concurrent Users
- **Ramp-up Period:** 60 Seconds
- **Duration:** 10 Minutes
- **Target URL:** `https://soit-project-app.com`

### 2. Performance Metrics (Results)
| Metric | Value | Status |
| :--- | :--- | :--- |
| **Peak Throughput** | 850 Requests/sec | ✅ Stable |
| **Avg Response Time** | 120 ms | ✅ Fast |
| **95th Percentile** | 450 ms | ✅ Within Limits |
| **Error Rate** | 0.02% | ✅ Minimal |

### 3. Key Observations
- **Stress Handling:** The system maintained a steady response time even when users spiked to 5,000.
- **Resource Usage:** CPU usage peaked at 75%, and Memory remained stable at 60%.
- **Bottlenecks:** Minor latency was observed during database write operations at peak load.

### 4. Conclusion & Recommendation
The application is capable of handling the expected traffic for the Noida Expo. To further improve, database indexing is recommended to reduce write-latency.

**Deliverable:** Gatling simulation script and HTML graphical report logs.
