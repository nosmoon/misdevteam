/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 : 
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.tn.bas.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.bas.ds.*;
import chosun.ciis.tn.bas.rec.*;

/**
 * 
 */


public class TN_BAS_3302_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String incmg_pers;
	public String bankaccountcode;
	public String bankcode;
	public String bank;
	public String branch;
	public String bankaccount;
	public String bankaccountowner;
	public String memo;
	public String useinsert;
	public String mode;

	public TN_BAS_3302_ADM(){}
	public TN_BAS_3302_ADM(String cmpy_cd, String incmg_pers, String bankaccountcode, String bankcode, String bank, String branch, String bankaccount, String bankaccountowner, String memo, String useinsert, String mode){
		this.cmpy_cd = cmpy_cd;
		this.incmg_pers = incmg_pers;
		this.bankaccountcode = bankaccountcode;
		this.bankcode = bankcode;
		this.bank = bank;
		this.branch = branch;
		this.bankaccount = bankaccount;
		this.bankaccountowner = bankaccountowner;
		this.memo = memo;
		this.useinsert = useinsert;
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setBankaccountcode(String bankaccountcode){
		this.bankaccountcode = bankaccountcode;
	}

	public void setBankcode(String bankcode){
		this.bankcode = bankcode;
	}

	public void setBank(String bank){
		this.bank = bank;
	}

	public void setBranch(String branch){
		this.branch = branch;
	}

	public void setBankaccount(String bankaccount){
		this.bankaccount = bankaccount;
	}

	public void setBankaccountowner(String bankaccountowner){
		this.bankaccountowner = bankaccountowner;
	}

	public void setMemo(String memo){
		this.memo = memo;
	}

	public void setUseinsert(String useinsert){
		this.useinsert = useinsert;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getBankaccountcode(){
		return this.bankaccountcode;
	}

	public String getBankcode(){
		return this.bankcode;
	}

	public String getBank(){
		return this.bank;
	}

	public String getBranch(){
		return this.branch;
	}

	public String getBankaccount(){
		return this.bankaccount;
	}

	public String getBankaccountowner(){
		return this.bankaccountowner;
	}

	public String getMemo(){
		return this.memo;
	}

	public String getUseinsert(){
		return this.useinsert;
	}

	public String getMode(){
		return this.mode;
	}

	public String getSQL(){
		 return "{ call MISTNN.SP_TN_BAS_3302_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		TN_BAS_3302_ADM dm = (TN_BAS_3302_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.incmg_pers);
		cstmt.setString(5, dm.bankaccountcode);
		cstmt.setString(6, dm.bankcode);
		cstmt.setString(7, dm.bank);
		cstmt.setString(8, dm.branch);
		cstmt.setString(9, dm.bankaccount);
		cstmt.setString(10, dm.bankaccountowner);
		cstmt.setString(11, dm.memo);
		cstmt.setString(12, dm.useinsert);
		cstmt.setString(13, dm.mode);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.tn.bas.ds.TN_BAS_3302_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("bankaccountcode = [" + getBankaccountcode() + "]");
		System.out.println("bankcode = [" + getBankcode() + "]");
		System.out.println("bank = [" + getBank() + "]");
		System.out.println("branch = [" + getBranch() + "]");
		System.out.println("bankaccount = [" + getBankaccount() + "]");
		System.out.println("bankaccountowner = [" + getBankaccountowner() + "]");
		System.out.println("memo = [" + getMemo() + "]");
		System.out.println("useinsert = [" + getUseinsert() + "]");
		System.out.println("mode = [" + getMode() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String bankaccountcode = req.getParameter("bankaccountcode");
if( bankaccountcode == null){
	System.out.println(this.toString+" : bankaccountcode is null" );
}else{
	System.out.println(this.toString+" : bankaccountcode is "+bankaccountcode );
}
String bankcode = req.getParameter("bankcode");
if( bankcode == null){
	System.out.println(this.toString+" : bankcode is null" );
}else{
	System.out.println(this.toString+" : bankcode is "+bankcode );
}
String bank = req.getParameter("bank");
if( bank == null){
	System.out.println(this.toString+" : bank is null" );
}else{
	System.out.println(this.toString+" : bank is "+bank );
}
String branch = req.getParameter("branch");
if( branch == null){
	System.out.println(this.toString+" : branch is null" );
}else{
	System.out.println(this.toString+" : branch is "+branch );
}
String bankaccount = req.getParameter("bankaccount");
if( bankaccount == null){
	System.out.println(this.toString+" : bankaccount is null" );
}else{
	System.out.println(this.toString+" : bankaccount is "+bankaccount );
}
String bankaccountowner = req.getParameter("bankaccountowner");
if( bankaccountowner == null){
	System.out.println(this.toString+" : bankaccountowner is null" );
}else{
	System.out.println(this.toString+" : bankaccountowner is "+bankaccountowner );
}
String memo = req.getParameter("memo");
if( memo == null){
	System.out.println(this.toString+" : memo is null" );
}else{
	System.out.println(this.toString+" : memo is "+memo );
}
String useinsert = req.getParameter("useinsert");
if( useinsert == null){
	System.out.println(this.toString+" : useinsert is null" );
}else{
	System.out.println(this.toString+" : useinsert is "+useinsert );
}
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String bankaccountcode = Util.checkString(req.getParameter("bankaccountcode"));
String bankcode = Util.checkString(req.getParameter("bankcode"));
String bank = Util.checkString(req.getParameter("bank"));
String branch = Util.checkString(req.getParameter("branch"));
String bankaccount = Util.checkString(req.getParameter("bankaccount"));
String bankaccountowner = Util.checkString(req.getParameter("bankaccountowner"));
String memo = Util.checkString(req.getParameter("memo"));
String useinsert = Util.checkString(req.getParameter("useinsert"));
String mode = Util.checkString(req.getParameter("mode"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String bankaccountcode = Util.Uni2Ksc(Util.checkString(req.getParameter("bankaccountcode")));
String bankcode = Util.Uni2Ksc(Util.checkString(req.getParameter("bankcode")));
String bank = Util.Uni2Ksc(Util.checkString(req.getParameter("bank")));
String branch = Util.Uni2Ksc(Util.checkString(req.getParameter("branch")));
String bankaccount = Util.Uni2Ksc(Util.checkString(req.getParameter("bankaccount")));
String bankaccountowner = Util.Uni2Ksc(Util.checkString(req.getParameter("bankaccountowner")));
String memo = Util.Uni2Ksc(Util.checkString(req.getParameter("memo")));
String useinsert = Util.Uni2Ksc(Util.checkString(req.getParameter("useinsert")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_pers(incmg_pers);
dm.setBankaccountcode(bankaccountcode);
dm.setBankcode(bankcode);
dm.setBank(bank);
dm.setBranch(branch);
dm.setBankaccount(bankaccount);
dm.setBankaccountowner(bankaccountowner);
dm.setMemo(memo);
dm.setUseinsert(useinsert);
dm.setMode(mode);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jun 22 18:08:40 KST 2016 */