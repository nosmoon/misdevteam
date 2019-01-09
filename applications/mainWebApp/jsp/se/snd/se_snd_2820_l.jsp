<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.snd.rec.*
	,	chosun.ciis.se.snd.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_snd_2820_l.jsp
* 기능 :  발송관리 - 마감관리 - 발송정보 DOWNLOAD
* 작성일자 : 2009-03-26
* 작성자 : 김대준
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	SE_SND_2820_LDataSet ds = (SE_SND_2820_LDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData			= 0;
	int recordSet			= 0;

	formData				= rx.add(root	, "chglist"		, "");
	try {
		String prt_dt		= "";
		String route_clsf	= "";
		String medi_cd		= "";
		String add_prt_seq  = "";
		int qty_index		= 0;
		int send_medi_index	= -1;
		String send_value	= "";
		String send_yn      = "";
		String send_medi_cd = "";
		
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_SND_2820_LCURLISTRecord rec = (SE_SND_2820_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(formData		, "record"			, "");
			rx.add(record, "cmpy_cd"			, rec.cmpy_cd			);
			rx.add(record, "issu_dt"			, rec.issu_dt			);
			rx.add(record, "clos_tms"			, rec.clos_tms			);
			rx.add(record, "route_clsf"			, rec.route_clsf		);
			rx.add(record, "route_clsf_nm"		, rec.route_clsf_nm		);
			rx.add(record, "prt_dt"				, rec.prt_dt			);
			rx.add(record, "medi_cd"			, rec.medi_cd			);
			rx.add(record, "medi_nm"			, rec.medi_nm			);
			rx.add(record, "sect_cd"			, rec.sect_cd			);
			rx.add(record, "sect_nm"			, rec.sect_nm			);
			rx.add(record, "pcnt"				, rec.pcnt				);
			rx.add(record, "clr_pcnt"			, rec.clr_pcnt			);
			rx.add(record, "add_prt_seq"		, rec.add_prt_seq		);
			rx.add(record, "qty"				, rec.qty				);
			rx.add(record, "send_clos_grp_clsf"	, rec.send_clos_grp_clsf);
			rx.add(record, "clos_dt_tm"			, rec.clos_dt_tm		);
			rx.add(record, "clos_dt"			, rec.clos_dt			);
			rx.add(record, "clos_tm"			, rec.clos_tm			);
			rx.add(record, "yn"					, rec.yn				);
			
			/*인쇄일자, 노선구분이 이전행과 틀리면 부수인덱스,전송매체인덱스 초기화*/
			if ( !prt_dt.equals(rec.prt_dt) ||  !route_clsf.equals(rec.route_clsf) ){
				qty_index	    = 0;
				send_medi_index = 0;
			} 
			
			send_yn    = rec.send_yn;
			send_value = rec.send_medi_cd;
			/*전송매체가 110이면 부수 인덱스 0 */
			if ( "110".equals(rec.send_medi_cd) ) {
				qty_index	    = 0;
			
		    }else {
		    	/*합쇄순번이 공란이 아니고 이전행과 동일하면 전송여부 "N"으로 */
		        if ( !"".equals(rec.add_prt_seq) && add_prt_seq.equals(rec.add_prt_seq)) {
		    	   send_yn = "N";
		    	
		    	}
		    	/*전송여부가 'N' 이면 이전 전송매체를 그대로 승계함. */
		    	if ( "N".equals(send_yn)  ) {
		    	   send_value = send_medi_cd;
		    	   
			    }else{
			    	qty_index	    = qty_index + 1;
			    	/*전송매체가 118이고 이전전송매체가 118이면 전송매체인덱스증가  */
			    	if ( "118".equals(rec.send_medi_cd) && send_medi_cd.equals(rec.send_medi_cd) ){
			    		send_medi_index = send_medi_index + 1;
						send_value		= String.valueOf(Integer.parseInt(rec.send_medi_cd) + send_medi_index);
					
						if ( send_value.length() < 3 ){
							for ( int j = 0 ; j < 3 - send_value.length() ; j++ ){
								send_value 	= "0" + send_value;
							}
						}
			    		
			    	}
			    		
		    	}
 	
		    } 
		    
		    
			rx.add(record, "send_medi_cd"		, send_value			);
			rx.add(record, "qty_index"			, qty_index				);
			rx.add(record, "send_yn"		    , send_yn		    	);
			
			
			if ( !prt_dt.equals(rec.prt_dt) ){
				prt_dt			= rec.prt_dt;
			}
			
			if ( !route_clsf.equals(rec.route_clsf) ){
				route_clsf		= rec.route_clsf;
			}
			
			if ( !medi_cd.equals(rec.medi_cd) ){
				medi_cd			= rec.medi_cd;
			}
			
			if ( !add_prt_seq.equals(rec.add_prt_seq) ){
				add_prt_seq			= rec.add_prt_seq;
			}
			
			if ( !send_medi_cd.equals(send_value) ){
				send_medi_cd			= send_value;
			}
 
		}
	} catch (Exception e) {
		System.out.println(e.getMessage());
	} finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<CURLIST>
		<record>
			<cmpy_cd/>
			<issu_dt/>
			<clos_tms/>
			<route_clsf/>
			<prt_dt/>
			<medi_cd/>
			<medi_nm/>
			<sect_cd/>
			<sect_nm/>
			<pcnt/>
			<clr_pcnt/>
			<add_prt_seq/>
			<qty/>
			<send_yn/>
			<send_medi_cd/>
		</record>
	</CURLIST>
</resData>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<resform>
		<curlist/>
	</resform>
</resData>
*/
%>

<% /* 작성시간 : Thu Mar 26 15:04:40 KST 2009 */ %>