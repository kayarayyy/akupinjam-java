package models;

public class FeatureRelationToRole {
    private int id;
    private int roleId;
    private int featureId;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getRoleId() {
        return roleId;
    }
    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }
    public int getFeatureId() {
        return featureId;
    }
    public void setFeatureId(int featureId) {
        this.featureId = featureId;
    }
}
