package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category
	// for
	// all 12 zodiac signs.

	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane
	// to display
	// a different horoscope based on the Zodiac's state.

	// 3. Make a main method to test your method

	public static void main(String[] args) {

		Zodiac[] options = { Zodiac.ARIES, Zodiac.TAURUS, Zodiac.GEMINI, Zodiac.CANCER, Zodiac.LEO, Zodiac.VIRGO,
				Zodiac.LIBRA, Zodiac.SCORPIO, Zodiac.SAGITTARIUS, Zodiac.CAPRICORN, Zodiac.AQUARIUS, Zodiac.PISCES };

		int input = JOptionPane.showOptionDialog(null, "What is your horoscope sign?", "Horoscope Displayer", 0, 3,
				null, options, 0);
		Zodiac choice = options[input];
		
		zodiacEnum(choice);
	}
		private static void zodiacEnum(Zodiac a) {
		switch (a) {
		case ARIES:
			JOptionPane.showMessageDialog(null,
					"You might get a bit of a shock today when someone known for selfishness steps up and makes a very generous offer.\n"
							+ " This is the real deal, so if this offer is extended to you—grab it fast, before someone else does! \n"
							+ "This person is going through a real growth phase, and you are in a good place to enjoy the benefits of it.\n "
							+ "Take the opportunity to give your support and words of encouragement. Also, don't forget to say thank you!\n");
			break;
		case TAURUS:
			JOptionPane.showMessageDialog(null, "Your heart and soul need exposure to a higher level of art. \n"
					+ "Take a chance and turn the dial to the classical station for the day. \n"
					+ "Let your mind process music in a new way. Visual art will be very stimulating, and your aesthetic \n"
					+ "sensibilities are tightly in tune with your intellect. If you widen your creative interests, \n"
					+ "you'll increase your curiosity for sophisticated things.\n");
			break;
		case GEMINI:
			JOptionPane.showMessageDialog(null,
					"Although you'll be cast in the role of the student today, you'll feel very empowered. \n"
							+ "Learning is something that takes time, but it offers more long-term rewards than you might imagine.\n"
							+ " It's time to think about the big picture and to put off immediate gains.\n"
							+ " Put in as much time as it takes to better understand what you are about to enter into.\n"
							+ " Ask questions, and feel good about doing so. There is no such thing as a stupid question!\n");
			break;
		case CANCER:
			JOptionPane.showMessageDialog(null,
					"One of your relationships—the one that has been giving you the most comfort lately—will enter\n"
							+ " a hard period. Someone is hiding his or her true feelings in an attempt to save yours. \n"
							+ "This wall of protection is starting to look suspiciously like a wall of ownership. \n"
							+ "By keeping you in the dark, is this person keeping you on a leash? Talk about these power issues today. \n"
							+ "If you introduce the topic with humor, you'll be able to get to the bottom of things and fix them fast.\n");
			break;
		case LEO:
			JOptionPane.showMessageDialog(null,
					"You are about to enter a placid, worry-free time—fun and feeling good are the name of the game. "
							+ "The world will suddenly feel like a giant amusement park, with stimulating sights and thrilling rides "
							+ "at every turn. This is a great time to begin exploring a new hobby, interest or career opportunity "
							+ "you've been thinking about. Your brain is open to new ideas and new ways of doing things. "
							+ "This proverbial old dog is ready to learn some new tricks!");
			break;
		case VIRGO:
			JOptionPane.showMessageDialog(null,
					"Today, while you're happily swimming along and just doing your thing, \n"
							+ "you may suddenly sense a disturbance in the waters—the behavior of someone close to you is \n"
							+ "getting unpredictable. Don't be surprised if this person makes an unusually big splash \n"
							+ "in order to get some attention. Try not to let these antics distract you from feeling \n"
							+ "happy and having a good time. You don't have to suffer because another person is making unwise choices.\n");
			break;
		case LIBRA:
			JOptionPane.showMessageDialog(null,
					"It's important to remember to appreciate beauty today—the creativity \n"
							+ "you're nurturing needs some aesthetic inspiration to fully flower. \n"
							+ "Natural beauty is the most effective way to do this, so try to find time to take a walk and enjoy the day.\n"
							+ " Even if you can get outside for only ten or fifteen minutes, the fresh air and light exercise will serve\n"
							+ " you well. Try to time it in the middle of the day, when you will likely need a boost in your energy level.\n");
			break;
		case SCORPIO:
			JOptionPane.showMessageDialog(null,
					"Your unconscious resistance to new ideas may be driving you away from \n"
							+ "inspiration—you must make an extra effort to open yourself up to opportunity today. \n"
							+ "Take time to examine whether you're up for a fresh new experience. If you are, then go out and \n"
							+ "embrace it! Make sure that you go forward in your life with your arms wide open.\n "
							+ "There is nothing to be afraid of, and you need to go out and live.\n");
			break;
		case SAGITTARIUS:
			JOptionPane.showMessageDialog(null,
					"If you're feeling low on energy right now, get out and surround yourself "
							+ "with people. Spending time in large groups will enliven your spirit today. \n"
							+ "Whether you're the center of attention or one of a million faces in a crowd, \n"
							+ "simply being surrounded by all that diverse energy will give you a jolt of enthusiasm. \n"
							+ "This is the perfect day for going to a large sporting event, an arena rock concert \n"
							+ "or even a business convention.");
			break;
		case CAPRICORN:
			JOptionPane.showMessageDialog(null, "You've been going through a very responsive phase, \n"
					+ "but today you should try to initiate more things. Socially, you need to make a \n"
					+ "plan and then invite others to join you—do not wait to be asked to be a part of \n"
					+ "someone else's soiree. You have great ideas, and the people in your life want to \n"
					+ "be a part of them. Pick something that you truly enjoy doing, and see who wants to join you.\n"
					+ " You may be surprised at the flood of positive responses you get.\n");
			break;
		case AQUARIUS:
			JOptionPane.showMessageDialog(null, "You're probably used to using charm to get what you want in life, \n"
					+ "but are you accustomed to other people using it on you? Today you might get blown away by \n"
					+ "a charming person who's laying it on a bit too thick. But there's no need to stop the \n"
					+ "flood of flattery that's rushing toward you. After all, there's nothing wrong with making \n"
					+ "this person work for what he or she wants, right? Make it clear that you are no pushover, \n"
					+ "and set an important precedent.");
			break;
		case PISCES:
			JOptionPane.showMessageDialog(null, "Starting today, finding a balance between what you want to do and \n"
					+ "what you can afford to do will be much easier. You will either be released from an unwanted\n"
					+ " and expensive commitment, or discover a new way to adjust your lifestyle. It's all about \n"
					+ "recognizing opportunity when it arrives and being flexible enough to make the most of things.\n"
					+ " Understand that a small and unpleasant adjustment now will yield satisfying and enriching \n"
					+ "benefits for years to come.");
		}
	}
}
