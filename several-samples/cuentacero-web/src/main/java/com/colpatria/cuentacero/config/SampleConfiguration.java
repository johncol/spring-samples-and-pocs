package com.colpatria.cuentacero.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Component
@Validated
@ConfigurationProperties("sample")
public class SampleConfiguration {

    @NotNull
    private String title;

    @Size(min = 10)
    private String description;

    @Min(0)
    @Max(10)
    private int priority;
    private boolean active;

    @Valid
    private InnerConfig innerConfig;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public InnerConfig getInnerConfig() {
        return innerConfig;
    }

    public void setInnerConfig(InnerConfig innerconfig) {
        this.innerConfig = innerconfig;
    }

    @Override
    public String toString() {
        return "SampleConfiguration{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", priority=" + priority +
                ", active=" + active +
                ", innerconfig=" + innerConfig +
                '}';
    }

    public static class InnerConfig {

        private Long id;

        @NotNull
        private String name;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "InnerConfig{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}
