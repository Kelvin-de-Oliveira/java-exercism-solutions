class Badge {
    public String print(Integer id, String name, String department) {
        String badge;
        String depart = (department == null) ? "OWNER" : department.toUpperCase();
        if(id == null)
            return badge = name + " " + "-" + " " + depart;
        return badge = "[" + id + "]" + " " + "-" + " " + name + " " + "-" + " " + depart;
    }
}

