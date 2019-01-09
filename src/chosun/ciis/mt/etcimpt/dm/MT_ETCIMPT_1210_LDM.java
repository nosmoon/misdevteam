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


package chosun.ciis.mt.etcimpt.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.etcimpt.ds.*;
import chosun.ciis.mt.etcimpt.rec.*;

/**
 * 
 */


public class MT_ETCIMPT_1210_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String yy;
	public String cmpy_cd;
	public String seq;
	public String sub_seq;
	public String leas_clsf;

	public MT_ETCIMPT_1210_LDM(){}
	public MT_ETCIMPT_1210_LDM(String yy, String cmpy_cd, String seq, String sub_seq, String leas_clsf){
		this.yy = yy;
		this.cmpy_cd = cmpy_cd;
		this.seq = seq;
		this.sub_seq = sub_seq;
		this.leas_clsf = leas_clsf;
	}

	public void setYy(String yy){
		this.yy = yy;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setSub_seq(String sub_seq){
		this.sub_seq = sub_seq;
	}

	public void setLeas_clsf(String leas_clsf){
		this.leas_clsf = leas_clsf;
	}

	public String getYy(){
		return this.yy;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getSub_seq(){
		return this.sub_seq;
	}

	public String getLeas_clsf(){
		return this.leas_clsf;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_ETCIMPT_1210_L(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_ETCIMPT_1210_LDM dm = (MT_ETCIMPT_1210_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.yy);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.seq);
		cstmt.setString(6, dm.sub_seq);
		cstmt.setString(7, dm.leas_clsf);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.etcimpt.ds.MT_ETCIMPT_1210_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("yy = [" + getYy() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("sub_seq = [" + getSub_seq() + "]");
		System.out.println("leas_clsf = [" + getLeas_clsf() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String yy = req.getParameter("yy");
if( yy == null){
	System.out.println(this.toString+" : yy is null" );
}else{
	System.out.println(this.toString+" : yy is "+yy );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String sub_seq = req.getParameter("sub_seq");
if( sub_seq == null){
	System.out.println(this.toString+" : sub_seq is null" );
}else{
	System.out.println(this.toString+" : sub_seq is "+sub_seq );
}
String leas_clsf = req.getParameter("leas_clsf");
if( leas_clsf == null){
	System.out.println(this.toString+" : leas_clsf is null" );
}else{
	System.out.println(this.toString+" : leas_clsf is "+leas_clsf );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String yy = Util.checkString(req.getParameter("yy"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String seq = Util.checkString(req.getParameter("seq"));
String sub_seq = Util.checkString(req.getParameter("sub_seq"));
String leas_clsf = Util.checkString(req.getParameter("leas_clsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String yy = Util.Uni2Ksc(Util.checkString(req.getParameter("yy")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String sub_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("sub_seq")));
String leas_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("leas_clsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setYy(yy);
dm.setCmpy_cd(cmpy_cd);
dm.setSeq(seq);
dm.setSub_seq(sub_seq);
dm.setLeas_clsf(leas_clsf);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Sat Jul 04 18:33:51 KST 2009 */