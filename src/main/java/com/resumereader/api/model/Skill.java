package com.resumereader.api.model;

import lombok.Data;

@Data
public class Skill {
    private int skillId;
    private String skillName;
    private SkillType skillType;
    private String skillUsedWhere;
    private String skillUsedHow;


}
