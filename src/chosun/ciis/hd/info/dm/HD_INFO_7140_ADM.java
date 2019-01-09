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


package chosun.ciis.hd.info.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.info.ds.*;
import chosun.ciis.hd.info.rec.*;

/**
 * 
 */


public class HD_INFO_7140_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String frlc_no;
	public byte[] phot;
	public String file_size;
	public String incmg_pers_ipadd;
	public String incmg_pers;

	public HD_INFO_7140_ADM(){}
	public HD_INFO_7140_ADM(String cmpy_cd, String frlc_no, byte[] phot, String file_size, String incmg_pers_ipadd, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.frlc_no = frlc_no;
		this.phot = phot;
		this.file_size = file_size;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFrlc_no(String frlc_no){
		this.frlc_no = frlc_no;
	}

	public void setPhot(byte[] phot){
		this.phot = phot;
	}

	public void setFile_size(String file_size){
		this.file_size = file_size;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFrlc_no(){
		return this.frlc_no;
	}

	public byte[] getPhot(){
		return this.phot;
	}

	public String getFile_size(){
		return this.file_size;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_INFO_7140_A(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_INFO_7140_ADM dm = (HD_INFO_7140_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.frlc_no);
		cstmt.setBytes(5, dm.phot);
		cstmt.setString(6, dm.file_size);
		cstmt.setString(7, dm.incmg_pers_ipadd);
		cstmt.setString(8, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.info.ds.HD_INFO_7140_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("frlc_no = [" + getFrlc_no() + "]");
		System.out.println("phot = [" + getPhot() + "]");
		System.out.println("file_size = [" + getFile_size() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
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
String frlc_no = req.getParameter("frlc_no");
if( frlc_no == null){
	System.out.println(this.toString+" : frlc_no is null" );
}else{
	System.out.println(this.toString+" : frlc_no is "+frlc_no );
}
String phot = req.getParameter("phot");
if( phot == null){
	System.out.println(this.toString+" : phot is null" );
}else{
	System.out.println(this.toString+" : phot is "+phot );
}
String file_size = req.getParameter("file_size");
if( file_size == null){
	System.out.println(this.toString+" : file_size is null" );
}else{
	System.out.println(this.toString+" : file_size is "+file_size );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
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
String frlc_no = Util.checkString(req.getParameter("frlc_no"));
String phot = Util.checkString(req.getParameter("phot"));
String file_size = Util.checkString(req.getParameter("file_size"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String frlc_no = Util.Uni2Ksc(Util.checkString(req.getParameter("frlc_no")));
String phot = Util.Uni2Ksc(Util.checkString(req.getParameter("phot")));
String file_size = Util.Uni2Ksc(Util.checkString(req.getParameter("file_size")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setFrlc_no(frlc_no);
dm.setPhot(phot);
dm.setFile_size(file_size);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Apr 02 09:49:02 KST 2013 */