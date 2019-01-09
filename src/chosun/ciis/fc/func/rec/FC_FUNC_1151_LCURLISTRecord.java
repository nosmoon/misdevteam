/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.fc.func.rec;

import java.sql.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.ds.*;

/**
 * 
 */


public class FC_FUNC_1151_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String yyyymm;
	public String balsaengcnttot;
	public String balsaengamttot;
	public String somyeolcnttot;
	public String somyeolamttot;
	public String daesoncnttot;
	public String daesonamttot;
	public String janaegcnttot;
	public String janaegamttot;

	public FC_FUNC_1151_LCURLISTRecord(){}

	public void setYyyymm(String yyyymm){
		this.yyyymm = yyyymm;
	}

	public void setBalsaengcnttot(String balsaengcnttot){
		this.balsaengcnttot = balsaengcnttot;
	}

	public void setBalsaengamttot(String balsaengamttot){
		this.balsaengamttot = balsaengamttot;
	}

	public void setSomyeolcnttot(String somyeolcnttot){
		this.somyeolcnttot = somyeolcnttot;
	}

	public void setSomyeolamttot(String somyeolamttot){
		this.somyeolamttot = somyeolamttot;
	}

	public void setDaesoncnttot(String daesoncnttot){
		this.daesoncnttot = daesoncnttot;
	}

	public void setDaesonamttot(String daesonamttot){
		this.daesonamttot = daesonamttot;
	}

	public void setJanaegcnttot(String janaegcnttot){
		this.janaegcnttot = janaegcnttot;
	}

	public void setJanaegamttot(String janaegamttot){
		this.janaegamttot = janaegamttot;
	}

	public String getYyyymm(){
		return this.yyyymm;
	}

	public String getBalsaengcnttot(){
		return this.balsaengcnttot;
	}

	public String getBalsaengamttot(){
		return this.balsaengamttot;
	}

	public String getSomyeolcnttot(){
		return this.somyeolcnttot;
	}

	public String getSomyeolamttot(){
		return this.somyeolamttot;
	}

	public String getDaesoncnttot(){
		return this.daesoncnttot;
	}

	public String getDaesonamttot(){
		return this.daesonamttot;
	}

	public String getJanaegcnttot(){
		return this.janaegcnttot;
	}

	public String getJanaegamttot(){
		return this.janaegamttot;
	}
}

/* 작성시간 : Thu Feb 05 17:20:16 KST 2009 */