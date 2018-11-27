-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th10 27, 2018 lúc 10:43 AM
-- Phiên bản máy phục vụ: 10.1.35-MariaDB
-- Phiên bản PHP: 7.2.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `dbexam2`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `answer`
--

CREATE TABLE `answer` (
  `AnswerID` int(11) NOT NULL,
  `AnswerContent` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `QuestionID` int(11) NOT NULL,
  `IsTrue` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Đang đổ dữ liệu cho bảng `answer`
--

INSERT INTO `answer` (`AnswerID`, `AnswerContent`, `QuestionID`, `IsTrue`) VALUES
(25, '40%', 4, 1),
(26, ' 62,5%   ', 4, 0),
(27, ' 63,5%   ', 4, 0),
(28, ' 72,5%   ', 4, 0),
(40, '', 0, 0),
(65, 'Nguyen Du ', 5, 1),
(66, 'Nguyen Trai ', 5, 0),
(67, 'Nguyen Khuyen ', 5, 0),
(68, 'Nguyen Binh Khiem ', 5, 0),
(69, '2', 1, 1),
(70, '3', 1, 0),
(71, '4', 1, 0),
(72, '1', 1, 0),
(73, '12', 2, 1),
(74, '2', 2, 0),
(75, '2', 2, 0),
(76, '2', 2, 0),
(77, '10', 3, 1),
(78, '11', 3, 0),
(79, '12', 3, 0),
(80, '13', 3, 0),
(81, '30', 7, 1),
(82, '20', 7, 0),
(83, '40', 7, 0),
(84, '50', 7, 0),
(85, '3', 8, 1),
(86, '2', 8, 0),
(87, '1', 8, 0),
(88, '4', 8, 0),
(89, '4 x2 ', 9, 1),
(90, '4', 9, 0),
(91, '4', 9, 0),
(92, '4', 9, 0),
(93, '13', 10, 1),
(94, '1', 10, 0),
(95, '1', 10, 0),
(96, '1', 10, 0),
(97, '72', 11, 1),
(98, '2', 11, 0),
(99, '7', 11, 0),
(100, '64', 11, 0),
(101, '12', 12, 1),
(102, '1', 12, 0),
(103, '-1', 12, 0),
(104, '0', 12, 0),
(105, '6x3', 13, 1),
(106, '13', 13, 0),
(107, '6x2', 13, 0),
(108, '12', 13, 0),
(109, '-1', 14, 1),
(110, '1', 14, 0),
(111, '2', 14, 0),
(112, '3', 14, 0),
(113, 'gg', 15, 1),
(114, 'g', 15, 0),
(115, 'g', 15, 0),
(116, 'g', 15, 0),
(117, '2', 16, 1),
(118, '2', 16, 0),
(119, '2', 16, 0),
(120, '2', 16, 0),
(121, '7', 17, 1),
(122, '1', 17, 0),
(123, '1', 17, 0),
(124, '1', 17, 0),
(125, 'Đoạn trường tân thanh', 18, 1),
(126, 'Kim Vân Kiều truyện', 18, 0),
(127, 'Kim Trọng – Thúy Kiều', 18, 0),
(128, 'Thúy Vân – Thúy Kiều', 18, 0),
(129, 'Lục bát', 19, 1),
(130, 'Song thất lục bát', 19, 0),
(131, 'Thất ngôn ', 19, 0),
(132, 'Thơ tự do ', 19, 0),
(133, ' 3245 ', 20, 1),
(134, '1236', 20, 0),
(135, '5246', 20, 0),
(136, '7894', 20, 0),
(137, 'Sáng tạo ', 21, 1),
(138, 'Phiên dịch ', 21, 0),
(139, 'Phóng tác', 21, 0),
(140, 'Phiên dịch và sửa đổi', 21, 0),
(141, 'Xã hội phong kiến đố kị, chà đạp những con người tài sắc. ', 22, 1),
(142, 'Là quy luật tất yếu của “thiên mệnh”, con người không thể tránh khỏi. ', 22, 0),
(143, 'Những người làm nghề ca nhi, kỉ nữ đều phải chịu đau khổ. ', 22, 0),
(144, 'Người phụ nữ tài sắc không thể không bất hạnh. ', 22, 0),
(145, 'Băn khoăn về số phận con người nói chung, của tài năng và phẩm giá trong xã hội cũ. ', 23, 1),
(146, 'Trăn trở về quyền sống của người phụ nữ ', 23, 0),
(147, 'Cảm thông với người kỉ nữ ', 23, 0),
(148, 'Thiết tha mong cho người phụ nữ có một cuộc sống tốt đẹp ', 23, 0),
(149, 'Kết hợp tự sự và trữ tình ', 24, 1),
(150, 'Miêu tả ', 24, 0),
(151, 'Tự sự', 24, 0),
(152, 'Trữ tình ', 24, 0),
(153, 'Khách quan, không bày tỏ thái độ ', 25, 1),
(154, 'Đồng tình ', 25, 0),
(155, 'Phê phán ', 25, 0),
(156, 'Ngợi ca', 25, 0),
(173, ' Người ta là hoa của đất', 26, 1),
(174, 'Người làm ra của, của không làm ra người', 26, 0),
(175, 'Người sống đống vàng', 26, 0),
(176, 'Người còn thì của còn', 26, 0),
(177, 'Dù hoàn cảnh nào cũng phải giữ phẩm giá cho trong sạch', 27, 1),
(178, 'Khi đói có thể không cần giữ sạch sẽ nữa', 27, 0),
(179, 'Khi đói cần giữ cho quần áo sạch sẽ, thơm tho', 27, 0),
(180, 'Khi đói khi no, lúc nào cũng phải giữ gìn quần áo cho sạch sẽ', 27, 0),
(181, 'Gia đình thân yêu của em.', 28, 1),
(182, ' Ý kiến của em về câu tục ngữ \"Đói cho sạch, rách cho thơm\"', 28, 0),
(183, 'Chứng minh tính đúng đắn của câu: Ăn quả nhớ kẻ trồng cây', 28, 0),
(184, 'Gia đình là điểm tựa của mỗi người. Ý kiến của em về vấn đề này', 28, 0),
(185, 'Nghị luận ', 29, 1),
(186, 'Tự sự ', 29, 0),
(187, 'Thuyết Minh ', 29, 0),
(188, 'Biểu cảm ', 29, 0);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `createsignin`
--

CREATE TABLE `createsignin` (
  `RoomID` int(11) NOT NULL,
  `StudentID` int(11) DEFAULT NULL,
  `UserPw` varchar(20) DEFAULT NULL,
  `TestID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Đang đổ dữ liệu cho bảng `createsignin`
--

INSERT INTO `createsignin` (`RoomID`, `StudentID`, `UserPw`, `TestID`) VALUES
(1, 1, 'DoNYtJLV', 2),
(1, 2, 'ytYELTjZ', 3),
(1, 3, 'SjYFpNnH', 1),
(1, 4, 'dYpFybTL', 2);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `createtest`
--

CREATE TABLE `createtest` (
  `QuestionID` int(11) NOT NULL,
  `TestID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Đang đổ dữ liệu cho bảng `createtest`
--

INSERT INTO `createtest` (`QuestionID`, `TestID`) VALUES
(9, 1),
(8, 1),
(7, 1),
(12, 1),
(10, 1),
(14, 1),
(2, 2),
(1, 2),
(7, 2),
(11, 2),
(12, 2),
(14, 2),
(9, 3),
(1, 3),
(8, 3),
(10, 3),
(11, 3),
(14, 3),
(27, 4),
(18, 4),
(24, 4),
(28, 4),
(5, 4),
(20, 4),
(23, 4),
(29, 4),
(22, 5),
(18, 5),
(5, 5),
(26, 5),
(19, 5),
(20, 5),
(21, 5),
(29, 5),
(26, 6),
(22, 6),
(19, 6),
(18, 6),
(24, 6),
(21, 6),
(20, 6),
(25, 6);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `question`
--

CREATE TABLE `question` (
  `QuestionID` int(11) NOT NULL,
  `QuestionContent` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `TopicID` int(11) NOT NULL,
  `QuestionLevel` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Đang đổ dữ liệu cho bảng `question`
--

INSERT INTO `question` (`QuestionID`, `QuestionContent`, `TopicID`, `QuestionLevel`) VALUES
(1, '1+1', 1, 1),
(2, '3 x 4 = ', 1, 1),
(3, '1+9', 1, 1),
(4, 'If number A is increased by 60% then it will equal number B. How much percentage will B be decreased by to equal A?', 2, 1),
(5, 'Tac gia truyen kieu ?', 4, 1),
(7, '5*6', 1, 1),
(8, '9 : 3 = ?', 1, 1),
(9, '4+4', 1, 1),
(10, '6+7 = ', 1, 2),
(11, '9*8', 1, 2),
(12, '6+6', 1, 2),
(13, '6+6+6', 1, 3),
(14, '9-10', 1, 3),
(15, 'g', 1, 1),
(16, '1+1', 1, 1),
(17, '3+4', 1, 2),
(18, ' Truyện Kiều là cách gọi vắn tắt của một truyện thơ của Nguyễn Du có tên là :', 4, 1),
(19, 'Truyện Kiều được viết theo thể thơ nào ?', 4, 1),
(20, 'Truyện Kiều gồm bao nhiêu câu thơ ? ', 4, 2),
(21, 'Từ Kim Vân Kiều truyện của Thanh Tâm Tài Nhân (Trung Quốc), Nguyễn Du đã làm gì để tạo nên Truyện Kiều ? ', 4, 2),
(22, 'Qua câu chuyện về thân phận bất hạnh, đáng thương của nàng Kiều, Nguyễn Du đã nhận thức và lí giải vấn đề “tài mệnh tương đố” theo hướng nào ? ', 4, 1),
(23, ' Giá trị nhân đạo sâu sắc nhất của Truyện Kiều là gì ? ', 4, 2),
(24, 'Thể loại truyện thơ của Việt Nam có điểm mạnh gì ? ', 4, 1),
(25, 'Nội dung Truyện Kiều phản ánh hiện thực xã hội với cảm hứng gì ? ', 4, 3),
(26, ' Câu tục ngữ nào không cùng nội dung với câu tục ngữ \"Một mặt người bằng mười mặt của\"?', 4, 1),
(27, 'Câu tục ngữ \"Đói cho sạch, rách cho thơm\" khuyên chúng ta điều gì?', 4, 1),
(28, 'Đề bài nào dưới đây không phải đề văn nghị luận?', 4, 1),
(29, ' Văn bản \"Tinh thần yêu nước của nhân dân ta\" (Hồ Chí Minh) thuộc loại văn bản nào?', 4, 3);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `result`
--

CREATE TABLE `result` (
  `StudentID` int(11) DEFAULT NULL,
  `ResultDate` varchar(255) DEFAULT NULL,
  `Points` float DEFAULT NULL,
  `TestID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Đang đổ dữ liệu cho bảng `result`
--

INSERT INTO `result` (`StudentID`, `ResultDate`, `Points`, `TestID`) VALUES
(1, '2018-11-27', 5, 2),
(2, '2018-11-27', 3.33333, 3),
(4, '2018-11-27', 1.66667, 2),
(3, '2018-11-27', 3.33333, 1);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `student`
--

CREATE TABLE `student` (
  `StudentID` int(11) NOT NULL,
  `StudentName` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `Class` varchar(255) NOT NULL,
  `Birthday` varchar(255) DEFAULT NULL,
  `ResultID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Đang đổ dữ liệu cho bảng `student`
--

INSERT INTO `student` (`StudentID`, `StudentName`, `Class`, `Birthday`, `ResultID`) VALUES
(1, 'Nguyen Minh Tuan ', 'CNTT1.01', '1998-01-06', NULL),
(2, 'Pham Ngoc Son', 'CNTT1.02', '1998-02-04', NULL),
(3, 'Nguyen Hoang Hung', 'CNTT1.03', '1998-03-11', NULL),
(4, 'Trinh Khanh Linh ', 'CNTT2.03', '1998-04-15', NULL),
(5, 'Do Bich Ngoc', 'CNTT2.03', '1998-05-12', NULL),
(6, 'Tran Thi Thu Huong', 'CNTT2.02', '1998-06-23', NULL),
(7, 'Nguyen Thi Thuy Duong', 'CNTT2.01', '1998-07-15', NULL),
(8, 'Pham Van Hoang', 'CNTT2.01', '1998-08-18', NULL),
(9, 'Tran Van Hung', 'CNTT2.03', '1998-09-22', NULL),
(10, 'Nguyen Hai Son', 'CNTT1.03', '1998-10-20', NULL),
(12, 'Giang ', 'CNTT2.03', '2018-11-12', NULL);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `subjects`
--

CREATE TABLE `subjects` (
  `SubjectID` int(11) NOT NULL,
  `SubjectName` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Đang đổ dữ liệu cho bảng `subjects`
--

INSERT INTO `subjects` (`SubjectID`, `SubjectName`) VALUES
(1, 'Toan'),
(2, 'Ngu Van'),
(3, 'Vat Ly'),
(4, 'Địa Lý '),
(5, 'Lịch sử');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `teacher`
--

CREATE TABLE `teacher` (
  `UserName` varchar(20) DEFAULT NULL,
  `PassWord` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Đang đổ dữ liệu cho bảng `teacher`
--

INSERT INTO `teacher` (`UserName`, `PassWord`) VALUES
('root', 'duong');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `test`
--

CREATE TABLE `test` (
  `TestID` int(11) NOT NULL,
  `AmountQuestion` int(11) NOT NULL,
  `TopicID` int(11) NOT NULL,
  `TestTime` int(11) NOT NULL,
  `Level1` int(11) DEFAULT NULL,
  `Level2` int(11) DEFAULT NULL,
  `Level3` int(11) DEFAULT NULL,
  `MaxPoint` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Đang đổ dữ liệu cho bảng `test`
--

INSERT INTO `test` (`TestID`, `AmountQuestion`, `TopicID`, `TestTime`, `Level1`, `Level2`, `Level3`, `MaxPoint`) VALUES
(1, 6, 1, 20, 3, 2, 1, 10),
(2, 6, 1, 20, 3, 2, 1, 10),
(3, 6, 1, 20, 3, 2, 1, 10),
(4, 8, 4, 3, 5, 2, 1, 100),
(5, 8, 4, 3, 5, 2, 1, 100),
(6, 8, 4, 3, 5, 2, 1, 100);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `topic`
--

CREATE TABLE `topic` (
  `TopicID` int(11) NOT NULL,
  `SubjectID` int(11) NOT NULL,
  `TopicName` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Đang đổ dữ liệu cho bảng `topic`
--

INSERT INTO `topic` (`TopicID`, `SubjectID`, `TopicName`) VALUES
(1, 1, 'Dai so '),
(2, 1, 'Giai Tich'),
(3, 1, 'Do hoa'),
(4, 2, 'Luyen tu va cau '),
(5, 2, 'Nghi luan '),
(6, 3, 'Anh Sang'),
(7, 3, 'Co Hoc'),
(8, 3, 'Dien Tu'),
(9, 3, 'Dong luc hoc'),
(15, 2, 'Tu Vung ');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `answer`
--
ALTER TABLE `answer`
  ADD PRIMARY KEY (`AnswerID`),
  ADD KEY `answer_ibfk_1` (`QuestionID`);

--
-- Chỉ mục cho bảng `createsignin`
--
ALTER TABLE `createsignin`
  ADD KEY `StudentID` (`StudentID`),
  ADD KEY `TestID` (`TestID`);

--
-- Chỉ mục cho bảng `createtest`
--
ALTER TABLE `createtest`
  ADD KEY `QuestionID` (`QuestionID`),
  ADD KEY `TestID` (`TestID`);

--
-- Chỉ mục cho bảng `question`
--
ALTER TABLE `question`
  ADD PRIMARY KEY (`QuestionID`),
  ADD KEY `TopicID` (`TopicID`);

--
-- Chỉ mục cho bảng `result`
--
ALTER TABLE `result`
  ADD KEY `StudentID` (`StudentID`),
  ADD KEY `TestID` (`TestID`);

--
-- Chỉ mục cho bảng `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`StudentID`);

--
-- Chỉ mục cho bảng `subjects`
--
ALTER TABLE `subjects`
  ADD PRIMARY KEY (`SubjectID`);

--
-- Chỉ mục cho bảng `test`
--
ALTER TABLE `test`
  ADD PRIMARY KEY (`TestID`),
  ADD KEY `TopicID` (`TopicID`);

--
-- Chỉ mục cho bảng `topic`
--
ALTER TABLE `topic`
  ADD PRIMARY KEY (`TopicID`),
  ADD KEY `SubjectID` (`SubjectID`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `answer`
--
ALTER TABLE `answer`
  MODIFY `AnswerID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=189;

--
-- AUTO_INCREMENT cho bảng `question`
--
ALTER TABLE `question`
  MODIFY `QuestionID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=30;

--
-- AUTO_INCREMENT cho bảng `student`
--
ALTER TABLE `student`
  MODIFY `StudentID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT cho bảng `subjects`
--
ALTER TABLE `subjects`
  MODIFY `SubjectID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT cho bảng `topic`
--
ALTER TABLE `topic`
  MODIFY `TopicID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `createsignin`
--
ALTER TABLE `createsignin`
  ADD CONSTRAINT `createsignin_ibfk_1` FOREIGN KEY (`StudentID`) REFERENCES `student` (`StudentID`),
  ADD CONSTRAINT `createsignin_ibfk_2` FOREIGN KEY (`TestID`) REFERENCES `test` (`TestID`);

--
-- Các ràng buộc cho bảng `createtest`
--
ALTER TABLE `createtest`
  ADD CONSTRAINT `createtest_ibfk_1` FOREIGN KEY (`QuestionID`) REFERENCES `question` (`QuestionID`),
  ADD CONSTRAINT `createtest_ibfk_2` FOREIGN KEY (`TestID`) REFERENCES `test` (`TestID`);

--
-- Các ràng buộc cho bảng `question`
--
ALTER TABLE `question`
  ADD CONSTRAINT `question_ibfk_1` FOREIGN KEY (`TopicID`) REFERENCES `topic` (`TopicID`);

--
-- Các ràng buộc cho bảng `result`
--
ALTER TABLE `result`
  ADD CONSTRAINT `result_ibfk_1` FOREIGN KEY (`StudentID`) REFERENCES `student` (`StudentID`),
  ADD CONSTRAINT `result_ibfk_2` FOREIGN KEY (`TestID`) REFERENCES `test` (`TestID`);

--
-- Các ràng buộc cho bảng `test`
--
ALTER TABLE `test`
  ADD CONSTRAINT `test_ibfk_1` FOREIGN KEY (`TopicID`) REFERENCES `topic` (`TopicID`);

--
-- Các ràng buộc cho bảng `topic`
--
ALTER TABLE `topic`
  ADD CONSTRAINT `topic_ibfk_1` FOREIGN KEY (`SubjectID`) REFERENCES `subjects` (`SubjectID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
