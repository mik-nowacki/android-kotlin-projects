# Android Kotlin Projects Collection

A comprehensive collection of Android projects helping me learn various development patterns, UI frameworks, and architectural approaches using Kotlin and Java.

## 📋 Projects Overview

### Modern Projects (Jetpack Compose)

#### 1. **Jetpack Compose Course**
Comprehensive learning project for Jetpack Compose UI framework with multiple tutorials.
- **Tech**: Kotlin, Jetpack Compose, Material 3, Compose animations
- **Key Concepts**: Compose layouts (Column, Row, Box, LazyColumn), state management, Material Design 3, advanced UI components

#### 2. **SpartApp**
Workout management application showcasing advanced Compose patterns and navigation.
- **Tech**: Kotlin, Jetpack Compose, Material 3, Navigation, ModalBottomSheet
- **Key Concepts**: Compose navigation, authentication flow, bottom sheets, modal dialogs

### Intermediate Projects

#### 3. **BucketList**
Multi-activity app for managing a personal bucket list with "Things to do" and "Places to visit" categories.
- **Tech**: Java, RecyclerView, CardView, Material Design, Multi-activity navigation
- **Key Concepts**: RecyclerView adapters, list management, activity navigation, navigation hubs

#### 4. **MyQuoteApp**
Quote display application template with structure for displaying motivational or inspirational quotes.
- **Tech**: Java, Material Design, ConstraintLayout

#### 5. **RegistrationApp**
User registration and authentication application with form handling.
- **Tech**: Kotlin, ViewBinding, Material Design, CardView
- **Key Concepts**: User input handling, authentication flow

#### 6. **ActivityLifecyclePlayground**
Educational project demonstrating Android activity lifecycle management and back button handling.
- **Tech**: Kotlin, ViewBinding, AlertDialog, Back Press Dispatcher
- **Key Concepts**: Activity lifecycle callbacks, dialog management, back navigation

### Foundational Projects (Java + XML Layouts)

#### 7. **BMICalculator**
Calculate Body Mass Index with age, height, weight, and gender inputs. Features conditional guidance for users under/over 18.
- **Tech**: Java, Material Design, ConstraintLayout
- **Key Concepts**: Form input handling, calculations, conditional logic

#### 8. **InchesToMeters**
Simple unit conversion utility from inches to meters with input validation.
- **Tech**: Java, EditText, Toast notifications
- **Key Concepts**: Input validation, string parsing, number formatting

#### 9. **Getting Started Project**
Basic template/starter project for learning Android fundamentals.
- **Tech**: Java, Material Design, ConstraintLayout

## 🚀 Getting Started

### Prerequisites
- **Android Studio** (latest version recommended)
- **JDK 11 or higher**
- **Gradle** (included with Android Studio)
- **Android SDK** (API level 24+)

### Building a Project

1. Open the workspace in Android Studio
2. Select the desired project folder
3. Sync Gradle files
4. Run the project on an emulator or physical device

Each project uses Gradle for build management:

```bash
./gradlew build      # Build the project
./gradlew assembleDebug  # Create debug APK
```

## 📚 Technology Progression

### Java + XML Layouts (Traditional)
- **Projects**: BMICalculator, InchesToMeters, BucketList, MyQuoteApp
- **Best For**: Learning Android fundamentals, XML layout design, traditional Android development

### Kotlin + ViewBinding (Intermediate)
- **Projects**: ActivityLifecyclePlayground, RegistrationApp
- **Best For**: Transitioning to modern Kotlin, understanding lifecycle management, safe view references

### Jetpack Compose (Modern)
- **Projects**: Jetpack Compose Course, SpartApp
- **Best For**: Modern UI development, reactive programming, learning latest Android development practices

## 📁 Project Structure

```
android-kotlin-projects-main/
├── ActivityLifecyclePlayground/   # Lifecycle management tutorial
├── BMICalculator/                 # BMI calculation utility
├── BucketList/                    # Bucket list manager
├── Getting Started Project/       # Starter template
├── InchesToMeters/                # Unit converter
├── Jetpack Compose Course/        # Compose learning project
├── MyQuoteApp/                    # Quote display app
├── RegistrationApp/               # Registration form
├── SpartApp/                      # Workout app with Compose
└── README.md                      # This file
```

## 🎯 Key Concepts Covered

### Android Fundamentals
- Activity lifecycle and lifecycle callbacks
- Intent and multi-activity navigation
- ViewBinding for safe view references
- Material Design principles

### UI Components & Layouts
- ConstraintLayout for responsive designs
- RecyclerView for efficient list display
- CardView and Material components
- Custom adapters and view holders

### Modern Android Development
- Jetpack Compose declarative UI
- State management in Compose
- Compose navigation and routing
- Material Design 3 theming

### Practical Features
- Form validation and input handling
- Dialog management and custom dialogs
- Toast notifications
- Bottom sheets and modal dialogs
- Authentication flows

## 💡 Learning Path

**Beginner** → Start with BMICalculator and InchesToMeters
**Intermediate** → Explore BucketList and ActivityLifecyclePlayground
**Advanced** → Dive into Jetpack Compose Course and SpartApp

## 🛠️ Tools & Resources

- **IDE**: Android Studio
- **Language**: Java & Kotlin
- **UI Framework**: XML Layouts & Jetpack Compose
- **Build System**: Gradle
- **Design**: Material Design & Material Design 3

## 📝 Notes

- Technology usage ranges from traditional Java/XML to modern Kotlin/Compose
- Each project is self-contained and can be built independently
