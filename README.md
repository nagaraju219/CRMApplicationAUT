# CRMApplicationAUT
We are trying to automate https://ui.cogmento.com/ website by using Selenium with Java using Page Object Model and BDD.

## Credentials

The tests require a username and password which are loaded from the environment variables `CRM_USERNAME` and `CRM_PASSWORD`. Set these variables before running the tests:

```bash
export CRM_USERNAME=your_email@example.com
export CRM_PASSWORD=your_password
```

Do **not** store credentials in the repository.

## Logs

Runtime log files are written to the `logs/` directory which is ignored by Git.
