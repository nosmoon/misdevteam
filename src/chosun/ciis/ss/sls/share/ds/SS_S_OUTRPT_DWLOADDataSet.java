/***************************************************************************************************
* 파일명 : SS_S_OUTRPT_DWLOADDataSet.java
* 기능 : 정보공유 출장보고서 파일다운로드
* 작성일자 : 2004-01-07
* 작성자 : 고윤홍
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.share.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.share.dm.*;
import chosun.ciis.ss.sls.share.rec.*;

/**
 * 정보공유-출장보고서 파일다운로드
 *
 */


public class SS_S_OUTRPT_DWLOADDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String filenm;
	public String filesize;
	public byte[] filecont;
    public transient Blob blob;

	public SS_S_OUTRPT_DWLOADDataSet(){}
	public SS_S_OUTRPT_DWLOADDataSet(String errcode, String errmsg, String filenm, String filesize, byte[] filecont){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.filenm = filenm;
		this.filesize = filesize;
		this.filecont = filecont;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setFilenm(String filenm){
		this.filenm = filenm;
	}

	public void setFilesize(String filesize){
		this.filesize = filesize;
	}

	public void setFilecont(byte[] filecont){
		this.filecont = filecont;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getFilenm(){
		return this.filenm;
	}

	public String getFilesize(){
		return this.filesize;
	}

	public byte[] getFilecont(){
		return this.filecont;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.filenm = Util.checkString(cstmt.getString(6));
		this.filesize = Util.checkString(cstmt.getString(7));
        this.blob = cstmt.getBlob(8);

        this.filecont = blob.getBytes(1, (int)blob.length());
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_S_OUTRPT_DWLOADDataSet ds = (SS_S_OUTRPT_DWLOADDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getFilenm()%>
<%= ds.getFilesize()%>
<%= ds.getFilecont()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jan 07 22:11:34 KST 2004 */