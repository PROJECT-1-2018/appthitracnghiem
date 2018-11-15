-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th10 15, 2018 lúc 05:32 PM
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
  `AnswerContent` varchar(255) NOT NULL,
  `QuestionID` int(11) NOT NULL,
  `IsTrue` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Đang đổ dữ liệu cho bảng `answer`
--

INSERT INTO `answer` (`AnswerID`, `AnswerContent`, `QuestionID`, `IsTrue`) VALUES
(13, '75', 1, 1),
(14, '140', 1, 0),
(15, '60', 1, 0),
(16, '80', 1, 0),
(17, '35/20    ', 2, 1),
(18, ' 7/40     ', 2, 0),
(19, '35/50   ', 2, 0),
(20, '175/100', 2, 0),
(21, ' 7kg of apples for $30,38', 3, 1),
(22, '5kg of apples for $21,5', 3, 0),
(23, '6kg of apples for $26,1', 3, 0),
(24, '4kg of apples for $17,32', 3, 0),
(25, '40%', 4, 1),
(26, ' 62,5%   ', 4, 0),
(27, ' 63,5%   ', 4, 0),
(28, ' 72,5%   ', 4, 0),
(33, 'Mien Bac', 6, 1),
(34, 'Mien Trung ', 6, 0),
(35, 'Mien Nam', 6, 0),
(36, 'Dao', 6, 0),
(40, '', 0, 0),
(41, '2', 7, 1),
(42, '1', 7, 0),
(43, '3', 7, 0),
(44, '4', 7, 0),
(45, '7', 8, 1),
(46, '8', 8, 0),
(47, '9', 8, 0),
(48, '10', 8, 0),
(49, '11', 9, 1),
(50, '12', 9, 0),
(51, '13', 9, 0),
(52, '14', 9, 0),
(53, '12', 10, 1),
(54, '13', 10, 0),
(55, '14', 10, 0),
(56, '15', 10, 0),
(57, '56', 11, 1),
(58, '12', 11, 0),
(59, '65', 11, 0),
(60, '45', 11, 0),
(61, '99', 12, 1),
(62, '90', 12, 0),
(63, '88', 12, 0),
(64, '77', 12, 0),
(65, 'Nguyen Du ', 5, 1),
(66, 'Nguyen Trai ', 5, 0),
(67, 'Nguyen Khuyen ', 5, 0),
(68, 'Nguyen Binh Khiem ', 5, 0),
(69, '3', 13, 1),
(70, '2', 13, 0),
(71, '1', 13, 0),
(72, '4', 13, 0);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `createsignin`
--

CREATE TABLE `createsignin` (
  `StudentID` int(11) DEFAULT NULL,
  `UserName` varchar(20) NOT NULL,
  `UserPw` varchar(20) DEFAULT NULL,
  `TestID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Đang đổ dữ liệu cho bảng `createsignin`
--

INSERT INTO `createsignin` (`StudentID`, `UserName`, `UserPw`, `TestID`) VALUES
(1, 'mCRXab', 'VuQFknJe', 2),
(2, 'OYcaoa', 'ZkDkEcBX', 3),
(3, 'XbrCFD', 'GptyNQLd', 1),
(5, 'EXIadQ', 'gZeesxIy', 2),
(7, 'jCvVrT', 'kjSOehZw', 3),
(9, 'ysYUzP', 'fNirIiyH', 1);

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
(3, 1),
(8, 1),
(9, 1),
(11, 1),
(13, 1),
(12, 1),
(9, 2),
(1, 2),
(8, 2),
(10, 2),
(11, 2),
(12, 2),
(9, 3),
(3, 3),
(1, 3),
(13, 3),
(2, 3),
(12, 3);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `question`
--

CREATE TABLE `question` (
  `QuestionID` int(11) NOT NULL,
  `QuestionContent` varchar(255) NOT NULL,
  `TopicID` int(11) NOT NULL,
  `QuestionLevel` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Đang đổ dữ liệu cho bảng `question`
--

INSERT INTO `question` (`QuestionID`, `QuestionContent`, `TopicID`, `QuestionLevel`) VALUES
(1, 'Peter counts his heart rate. He counts 8 beats per 6 seconds on average. How many beats per minute does Peter count?', 1, 1),
(2, 'Which fraction is equal to 17,5%?', 1, 2),
(3, 'Mia wants to buy apple. Which is the best buy?', 1, 1),
(4, 'If number A is increased by 60% then it will equal number B. How much percentage will B be decreased by to equal A?', 2, 1),
(5, 'Tac gia truyen kieu ?', 4, 1),
(6, 'Yen Bai thuoc mien nao Viet Nam', 10, 1),
(7, '1+1 = ?', 1, 1),
(8, '3+4=?', 1, 1),
(9, '5+6 = ?', 1, 1),
(10, '3x4=?', 1, 2),
(11, '7 x 8 = ?', 1, 2),
(12, '9 x 11 = ?', 1, 3),
(13, '9 : 3 = ?', 1, 2);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `result`
--

CREATE TABLE `result` (
  `StudentID` int(11) DEFAULT NULL,
  `ResultDate` date DEFAULT NULL,
  `Points` float DEFAULT NULL,
  `TestID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `student`
--

CREATE TABLE `student` (
  `StudentID` int(11) NOT NULL,
  `StudentName` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci NOT NULL,
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
(11, 'Nguy?n Vi?t Ti?n ', 'CNTT2.01', '1998-09-22', NULL);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `subjects`
--

CREATE TABLE `subjects` (
  `SubjectID` int(11) NOT NULL,
  `SubjectName` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Đang đổ dữ liệu cho bảng `subjects`
--

INSERT INTO `subjects` (`SubjectID`, `SubjectName`) VALUES
(1, 'Toan'),
(2, 'Ngu Van'),
(3, 'Vat Ly'),
(4, 'Dia Ly'),
(5, 'Lich Su'),
(6, 'Tieng Anh');

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
(3, 6, 1, 20, 3, 2, 1, 10);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `topic`
--

CREATE TABLE `topic` (
  `TopicID` int(11) NOT NULL,
  `SubjectID` int(11) NOT NULL,
  `TopicName` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Đang đổ dữ liệu cho bảng `topic`
--

INSERT INTO `topic` (`TopicID`, `SubjectID`, `TopicName`) VALUES
(1, 1, 'Dai So'),
(2, 1, 'Giai Tich'),
(3, 1, 'Do hoa'),
(4, 2, 'Luyen tu va cau '),
(5, 2, 'Nghi luan '),
(6, 3, 'Anh Sang'),
(7, 3, 'Co Hoc'),
(8, 3, 'Dien Tu'),
(9, 3, 'Dong luc hoc'),
(10, 4, 'Viet Nam'),
(11, 4, 'Trung Quoc'),
(12, 5, 'Van hoa '),
(13, 5, 'Kinh te'),
(14, 5, 'Giao Duc');

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
  MODIFY `AnswerID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=73;

--
-- AUTO_INCREMENT cho bảng `question`
--
ALTER TABLE `question`
  MODIFY `QuestionID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT cho bảng `student`
--
ALTER TABLE `student`
  MODIFY `StudentID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT cho bảng `subjects`
--
ALTER TABLE `subjects`
  MODIFY `SubjectID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT cho bảng `topic`
--
ALTER TABLE `topic`
  MODIFY `TopicID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

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
