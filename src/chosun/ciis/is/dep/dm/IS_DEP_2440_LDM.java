/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.is.dep.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.dep.ds.*;
import chosun.ciis.is.dep.rec.*;

/**
 * 
 */


public class IS_DEP_2440_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String bank_cd;
	public String note_no;
	public String note_seq;
	public String incmg_pers;

	public IS_DEP_2440_LDM(){}
	public IS_DEP_2440_LDM(String cmpy_cd, String bank_cd, String note_no, String note_seq, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.bank_cd = bank_cd;
		this.note_no = note_no;
		this.note_seq = note_seq;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBank_cd(String bank_cd){
		this.bank_cd = bank_cd;
	}

	public void setNote_no(String note_no){
		this.note_no = note_no;
	}

	public void setNote_seq(String note_seq){
		this.note_seq = note_seq;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getBank_cd(){
		return this.bank_cd;
	}

	public String getNote_no(){
		return this.note_no;
	}

	public String getNote_seq(){
		return this.note_seq;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_IS_DEP_2440_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		IS_DEP_2440_LDM dm = (IS_DEP_2440_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.bank_cd);
		cstmt.setString(5, dm.note_no);
		cstmt.setString(6, dm.note_seq);
		cstmt.setString(7, dm.incmg_pers);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.is.dep.ds.IS_DEP_2440_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("bank_cd = [" + getBank_cd() + "]");
		System.out.println("note_no = [" + getNote_no() + "]");
		System.out.println("note_seq = [" + getNote_seq() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String bank_cd = req.getParameter("bank_cd");
if( bank_cd == null){
	System.out.println(this.toString+" : bank_cd is null" );
}else{
	System.out.println(this.toString+" : bank_cd is "+bank_cd );
}
String note_no = req.getParameter("note_no");
if( note_no == null){
	System.out.println(this.toString+" : note_no is null" );
}else{
	System.out.println(this.toString+" : note_no is "+note_no );
}
String note_seq = req.getParameter("note_seq");
if( note_seq == null){
	System.out.println(this.toString+" : note_seq is null" );
}else{
	System.out.println(this.toString+" : note_seq is "+note_seq );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String bank_cd = Util.checkString(req.getParameter("bank_cd"));
String note_no = Util.checkString(req.getParameter("note_no"));
String note_seq = Util.checkString(req.getParameter("note_seq"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String bank_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bank_cd")));
String note_no = Util.Uni2Ksc(Util.checkString(req.getParameter("note_no")));
String note_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("note_seq")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setBank_cd(bank_cd);
dm.setNote_no(note_no);
dm.setNote_seq(note_seq);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue May 22 14:06:36 KST 2012 */