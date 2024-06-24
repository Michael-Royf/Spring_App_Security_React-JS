package com.michael.document.constant;

public class Constants {
    public static final String[] PUBLIC_URLS = {
            "/user/reset_password/reset/**",
            "/user/verify/resetpassword/**",
            "/user/reset_password/**",
            "/user/reset_password/**",
            "/user/verify/qrcode/**",
            "/user/login/**",
            "/user/verify/account/**",
            "/user/register/**",
            "/user/new/password/**",
            "/user/verify/**",

         //   "/user/image/**",
            "/user/verify/password/**"
            //     "/user/mfa/setup/**"
    };

    public static final String[] SWAGGER_PUBLIC_URLS = {
            "/v3/api-docs/**",
            "/swagger-resources",
            "/swagger-resources/**",
            "/configuration/ui",
            "/configuration/security",
            "/swagger-ui/**",
            "/webjars/**",
            "/swagger-ui.html"
    };
    public static final int NINETY_DAYS = 90;
    public static final int STRENGTH = 12;
    public static final String BASE_PATH = "/**";
    public static final String FILE_NAME = "File-Name";
    public static final String LOGIN_PATH = "/user/login";
    public static final String[] PUBLIC_ROUTES = {"/user/reset_password/reset",
            "/user/verify/resetpassword",
            "/user/reset_password",
            "/user/verify/qrcode", "/user/stream", "/user/id", "/user/login", "/user/register", "/user/new/password",
            "/user/verify",
            "/user/refresh/token",
         //   "/user/image",
            "/user/verify/account", "/user/verify/password", "/user/verify/code"};
    public static final String AUTHORITIES = "authorities";
    public static final String GET_ARRAYS_LLC = "GET_ARRAYS_LLC";
    public static final String EMPTY_VALUE = "empty";
    public static final String ROLE = "role";
    public static final String ROLE_PREFIX = "ROLE_";
    public static final String AUTHORITY_DELIMITER = ",";
    public static final String USER_AUTHORITIES = "document:create,document:read,document:update,document:delete";
    public static final String ADMIN_AUTHORITIES = "user:create,user:read,user:update,document:create,document:read,document:update,document:delete";
    public static final String SUPER_ADMIN_AUTHORITIES = "user:create,user:read,user:update,user:delete,document:create,document:read,document:update,document:delete";
    public static final String MANAGER_AUTHORITIES = "document:create,document:read,document:update,document:delete";
    public static final String FILE_STORAGE = "C://Users/micha/Downloads/uploads/";

    public static final String SELECT_DOCUMENTS_QUERY = "select doc.id, doc.document_id, doc.name, doc.description, doc.uri, doc.icon, doc.size, doc.formatted_size, doc.extension, doc.reference_id,  doc.created_at, doc.updated_at, CONCAT(owner.first_name, '', owner.last_name) AS owner_name, owner.email AS owner_email,owner.phone AS owner_phone, owner.last_login AS owner_last_login, CONCAT(updater.first_name, '', updater.last_name) AS updater_name FROM documents  doc JOIN users owner ON owner.id = doc.created_by JOIN users updater ON updater.id = doc.updated_by";
    public static final String  SELECT_COUNT_DOCUMENTS_QUERY ="SELECT COUNT(*) FROM documents";


    public static final String SELECT_DOCUMENTS_BY_NAME_QUERY = "select doc.id, doc.document_id, doc.name, doc.description, doc.uri, doc.icon, doc.size, doc.formatted_size, doc.extension, doc.reference_id,  doc.created_at, doc.updated_at, CONCAT(owner.first_name, '', owner.last_name) AS owner_name, owner.email AS owner_email,owner.phone AS owner_phone, owner.last_login AS owner_last_login, CONCAT(updater.first_name, '', updater.last_name) AS updater_name FROM documents  doc JOIN users owner ON owner.id = doc.created_by JOIN users updater ON updater.id = doc.updated_by WHERE name ~* :documentName";
    public static final String  SELECT_COUNT_DOCUMENTS_BY_NAME_QUERY ="SELECT COUNT(*) FROM documents WHERE name ~* :documentName";

    public static final String SELECT_DOCUMENT_QUERY = "select doc.id, doc.document_id, doc.name, doc.description, doc.uri, doc.icon, doc.size, doc.formatted_size, doc.extension, doc.reference_id,  doc.created_at, doc.updated_at, CONCAT(owner.first_name, '', owner.last_name) AS owner_name, owner.email AS owner_email,owner.phone AS owner_phone, owner.last_login AS owner_last_login, CONCAT(updater.first_name, '', updater.last_name) AS updater_name FROM documents  doc JOIN users owner ON owner.id = doc.created_by JOIN users updater ON updater.id = doc.updated_by WHERE doc.document_id = ?1";

}
