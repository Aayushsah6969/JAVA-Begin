
interface employee{
    void getDetails(int emp_id, String emp_name);
}

interface Manager extends employee{
    void getDeptDetails();
}