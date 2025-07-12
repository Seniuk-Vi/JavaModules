module main.university {
    requires main.api;
    provides main.api.Accountant with main.university.AccountantImpl;
}