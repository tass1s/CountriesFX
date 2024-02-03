package gr.unipi.CountriesFX;

import java.util.LinkedHashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "common", "official", "nativeName" })

public class Name {

	@JsonProperty("common")
	private String common;
	@JsonProperty("official")
	private String official;
	@JsonProperty("nativeName")
	private NativeName nativeName;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

	@JsonProperty("common")
	public String getCommon() {
		return common;
	}

	@JsonProperty("common")
	public void setCommon(String common) {
		this.common = common;
	}

	@JsonProperty("official")
	public String getOfficial() {
		return official;
	}

	@JsonProperty("official")
	public void setOfficial(String official) {
		this.official = official;
	}

	@JsonProperty("nativeName")
	public NativeName getNativeName() {
		return nativeName;
	}

	@Override
	public String toString() {
		return "Common: " + common + ", Official: " + official + ", Native Name: " + nativeName;
	}
}
