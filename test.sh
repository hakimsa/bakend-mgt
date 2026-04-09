#!/bin/bash


# models
mkdir -p src/main/java/com/example/mangerapi/models
cat > src/main/java/com/example/mangerapi/models/package-info.java << 'EOF'
/**
 * Models package containing JPA entities.
 */
package com.example.mangerapi.models;
EOF

# controllers
mkdir -p src/main/java/com/example/mangerapi/controllers
cat > src/main/java/com/example/mangerapi/controllers/package-info.java << 'EOF'
/**
 * Controllers package containing REST controllers.
 */
package com.example.mangerapi.controllers;
EOF

# services
mkdir -p src/main/java/com/example/mangerapi/services
cat > src/main/java/com/example/mangerapi/services/package-info.java << 'EOF'
/**
 * Services package containing business logic.
 */
package com.example.mangerapi.services;
EOF

# repository
mkdir -p src/main/java/com/example/mangerapi/repository
cat > src/main/java/com/example/mangerapi/repository/package-info.java << 'EOF'
/**
 * Repository package containing data access interfaces.
 */
package com.example.mangerapi.repository;
EOF

# main
cat > src/main/java/com/example/mangerapi/package-info.java << 'EOF'
/**
 * Main application package.
 */
package com.example.mangerapi;
EOF
