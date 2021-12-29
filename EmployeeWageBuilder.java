class EmployeeWageBuilder {
    public static final int IsFullTime = 1, IsPartTime = 2;
    public static final int employeRatePerHour = 20, numWorkingDays = 20, hourInMonth = 100;

    public static void attendance() {
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == IsFullTime) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Not Present");
        }
    }

    public static void dailyWage() {
        int EmployeWages = 0, employeHour = 0;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == IsFullTime) {
            employeHour = 8;
        } else {
            employeHour = 0;
        }
        EmployeWages = employeHour * employeRatePerHour;
        System.out.println("Employewage: " + EmployeWages);
    }

    public void checkWage() {
        int employeWages = 0, employeHour = 0;
        double empCheck = Math.floor(Math.random() * 10) % 3;
        if (empCheck == IsFullTime) {
            employeHour = 8;
        } else if (empCheck == IsPartTime) {
            employeHour = 8;
        } else {
            employeHour = 0;
        }
        employeWages = employeHour * employeRatePerHour;
        System.out.println("Employewage: " + employeWages);
    }

    public void usingSwitch() {
        int employeWages = 0, employeHour = 0;
        int employeCheck = (int) Math.floor(Math.random() * 10) % 3;
        switch (employeCheck) {
            case IsFullTime:
                employeHour = 8;
                break;
            case IsPartTime:
                employeHour = 4;
                break;
            default:
                employeHour = 0;
        }
        employeWages = employeHour * employeRatePerHour;
        System.out.println("Employewage: " + employeWages);
    }

    public void getMonthlyWage() {
        int employeWages = 0, employeHour = 0, totalEmployeWage = 0;
        for (int day = 0; day < numWorkingDays; day++) {
            int EmployeCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (EmployeCheck) {
                case IsFullTime:
                    employeHour = 8;
                    break;
                case IsPartTime:
                    employeHour = 4;
                    break;
                default:
                    employeHour = 0;
            }
            employeWages = employeHour * employeRatePerHour;
            totalEmployeWage += employeWages;
            System.out.println("Employewage: " + employeWages);
        }
        System.out.println("TotalEmployewage: " + totalEmployeWage);
    }

    public void getMonthlyWageCondition() {
        int employeWages = 0, totalEmployeHour = 0, totalEmployeWage = 0, totalWorkingDays = 0;
        while (totalWorkingDays < numWorkingDays && totalEmployeHour <= hourInMonth) {
            int employeHour = 0;
            totalWorkingDays++;
            int employeCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (employeCheck) {
                case IsFullTime:
                    employeHour = 8;
                    break;
                case IsPartTime:
                    employeHour = 4;
                    break;
                default:
                    employeHour = 0;
            }
            totalEmployeHour += employeHour;
            employeWages = employeHour * employeRatePerHour;
            totalEmployeWage += employeWages;
            System.out.println("Employewage: " + employeWages);
        }
        System.out.println("TotalEmployewage: " + totalEmployeWage);
    }

    public static void main(String[] args) {
        EmployeeWageBuilder worker = new EmployeeWageBuilder();
        worker.attendance();
        worker.dailyWage();
        worker.checkWage();
        worker.usingSwitch();
        worker.getMonthlyWage();
        worker.getMonthlyWageCondition();
    }

}