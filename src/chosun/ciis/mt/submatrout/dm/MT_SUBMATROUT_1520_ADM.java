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


package chosun.ciis.mt.submatrout.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.submatrout.ds.*;
import chosun.ciis.mt.submatrout.rec.*;

/**
 * 
 */


public class MT_SUBMATROUT_1520_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_dt;
	public String seq;
	public String gubun;

	public MT_SUBMATROUT_1520_ADM(){}
	public MT_SUBMATROUT_1520_ADM(String cmpy_cd, String occr_dt, String seq, String gubun){
		this.cmpy_cd = cmpy_cd;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.gubun = gubun;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setGubun(String gubun){
		this.gubun = gubun;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getGubun(){
		return this.gubun;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_SUBMATROUT_1520_A(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_SUBMATROUT_1520_ADM dm = (MT_SUBMATROUT_1520_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.occr_dt);
		cstmt.setString(5, dm.seq);
		cstmt.setString(6, dm.gubun);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.submatrout.ds.MT_SUBMATROUT_1520_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("gubun = [" + getGubun() + "]");
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
String occr_dt = req.getParameter("occr_dt");
if( occr_dt == null){
	System.out.println(this.toString+" : occr_dt is null" );
}else{
	System.out.println(this.toString+" : occr_dt is "+occr_dt );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String gubun = req.getParameter("gubun");
if( gubun == null){
	System.out.println(this.toString+" : gubun is null" );
}else{
	System.out.println(this.toString+" : gubun is "+gubun );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String gubun = Util.checkString(req.getParameter("gubun"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setGubun(gubun);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Sep 16 01:24:30 KST 2009 */