# API Testing with Postman

**Objective:** To validate RESTful API endpoints for Authentication and Data Retrieval.

### 1. Test Suite Overview
- **Tool:** Postman
- **API Type:** REST
- **Endpoints Tested:** `/api/login`, `/api/users`, `/api/products`

### 2. Test Scenarios & Results

| Test Case | Method | Endpoint | Expected Result | Status |
| :--- | :--- | :--- | :--- | :--- |
| User Authentication | POST | `/login` | Status 200 + Bearer Token | ✅ PASSED |
| Invalid Login | POST | `/login` | Status 401 Unauthorized | ✅ PASSED |
| Fetch User Profile | GET | `/profile` | JSON with user details | ✅ PASSED |
| Data Retrieval | GET | `/data` | List of items (Array) | ✅ PASSED |

### 3. Key Validations Performed
- **Status Code:** Checked if the server returns 200 OK for successful requests.
- **Response Time:** Verified that all responses are received within < 200ms.
- **JSON Schema:** Validated that the response body contains required fields like `id`, `name`, and `email`.
- **Auth Headers:** Tested if protected routes block requests without a valid JWT token.

**Deliverable:** Postman Collection (JSON) exported and attached in the repository.
